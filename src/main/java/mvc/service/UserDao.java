package mvc.service;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public UserDao() {}

    public String getUserName() {
        return "熊猫与乐乐";
    }
}
