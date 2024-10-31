package proxy.aop;

import org.springframework.stereotype.Component;

@Component
public class MyTestInterfaceImpl1 implements MyTestInterface {
    @Override
    public void test() {
        System.out.println("this is myTestInterfaceImpl1`s test()");
    }

    @Override
    public void fun1() {
        System.out.println("this is myTestInterfaceImpl1`s fun1()");
    }
}
