package proxy.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("proxy.aop");
        MyTestInterface bean = applicationContext.getBean(MyTestInterface.class);
        bean.test();
    }
}
