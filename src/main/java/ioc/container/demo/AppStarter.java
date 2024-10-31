package ioc.container.demo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class AppStarter {
    public static void main(String[] args) {
        startWithAC();
        //startWithBF();
    }

    public static void startWithAC(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("ioc.container.demo");
        MyTestBean myTestBean = applicationContext.getBean(MyTestBean.class);
        myTestBean.print();

        applicationContext.publishEvent(new MyTestEvent("source","test_event"));
    }

    public static void startWithBF() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(beanFactory);
        scanner.scan("ioc.container.demo");

        MyTestBean myTestBean = beanFactory.getBean(MyTestBean.class);
        myTestBean.print();
    }
}
