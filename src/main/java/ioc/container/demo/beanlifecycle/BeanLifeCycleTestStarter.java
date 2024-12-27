package ioc.container.demo.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifeCycleTestStarter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("ioc.container.demo.beanlifecycle");
        BeanA a = applicationContext.getBean(BeanA.class);
        a.use();
        applicationContext.destroy();
    }
}
