package proxy.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxy.aop.test_class.MyTestClazz;
import proxy.aop.test_interface.MyTestInterface;

public class TestAopStarter {
    public static void main(String[] args) {
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(beanFactory);
//        scanner.scan("proxy.aop");
//
//        MyTestClazz myTestClazz = beanFactory.getBean(MyTestClazz.class);
//        myTestClazz.test();

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("proxy.aop");
        MyTestInterface bean = applicationContext.getBean("myTestInterfaceImpl1", MyTestInterface.class);
        bean.test();
        bean.fun1();
        MyTestClazz clazzBean = applicationContext.getBean(MyTestClazz.class);
        clazzBean.test("li");
    }
}
