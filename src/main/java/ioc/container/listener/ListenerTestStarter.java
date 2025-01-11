package ioc.container.listener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ListenerTestStarter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("ioc.container.listener");
        applicationContext.publishEvent(new MyTestEvent("source","test"));
    }
}
