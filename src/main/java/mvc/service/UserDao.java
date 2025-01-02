package mvc.service;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public UserDao() {
        System.out.println("熊猫与乐乐");
    }

    public String getUserName() {
        return "熊猫与乐乐";
    }
}
