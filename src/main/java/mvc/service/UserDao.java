package mvc.service;

import mvc.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UserDao() {}

    public String getUserName() {
        User user = jdbcTemplate.queryForObject("select id,username,password from xxl_job_user where id = '1'", (rs, rowNum) -> {
            User temp = new User();
            temp.setId(rs.getInt("id"));
            temp.setName(rs.getString("username"));
            temp.setPassword(rs.getString("password"));
            return temp;
        });
        return user.getName();
    }
}
