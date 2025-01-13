package ioc.container.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertUser(User user) {
        String sql = "INSERT INTO user (name, password) VALUES (?,?)";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        int update = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement preparedStatement = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getPassword());
                return preparedStatement;
            }
        }, keyHolder);
        user.setId(Objects.requireNonNull(keyHolder.getKey()).intValue());
        if (update == 1) {
            System.out.println("成功添加"+update +"个用户，"+user);
            return true;
        }
        System.out.println("用户添加失败");
        return false;
    }
}
