package proxy.aop.test_interface;

import org.springframework.stereotype.Component;

@Component
public class MyTestInterfaceImpl implements MyTestInterface {
    @Override
    public void test() {
        System.out.println("this is myTestInterfaceImpl`s test()");
    }

    @Override
    public void fun1() {
        System.out.println("this is myTestInterfaceImpl`s fun1()");
    }
}
