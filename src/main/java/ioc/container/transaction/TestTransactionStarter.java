package ioc.container.transaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTransactionStarter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("ioc.container.transaction");
        UserService userService = applicationContext.getBean(UserService.class);

        User li = new User("li","123456");
        User zeng = new User("zeng","1234567");
        userService.addUsers(li,zeng);
    }

}
