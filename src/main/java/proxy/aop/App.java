package proxy.aop;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class App {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(beanFactory);
        scanner.scan("proxy.aop");

        MyTestClazz myTestClazz = beanFactory.getBean(MyTestClazz.class);
        myTestClazz.test();

//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("proxy.aop.xml");
//        MyTestInterface bean = applicationContext.getBean("myTestInterfaceImpl1", MyTestInterface.class);
//        //MyTestClazz bean = applicationContext.getBean(MyTestClazz.class);
//        bean.test();
//        bean.fun1();
    }
}
