package ioc.container.start;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class AppStarter {
    public static void main(String[] args) {
        startWithAC();
        //startWithBF();
    }

    public static void startWithAC(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("ioc.container.start");
        MyTestBean myTestBean = applicationContext.getBean(MyTestBean.class);
        myTestBean.print();
    }

    public static void startWithBF() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(beanFactory);
        scanner.scan("ioc.container.start");

        MyTestBean myTestBean = beanFactory.getBean(MyTestBean.class);
        myTestBean.print();
    }
}
