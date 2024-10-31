package proxy.aop;

import org.springframework.stereotype.Component;

@Component
public class MytTestInterfaceImpl implements MyTestInterface {
    @Override
    public void test() {
        System.out.println("this is myTestInterfaceImpl`s test()");
    }

    @Override
    public void fun1() {
        System.out.println("this is myTestInterfaceImpl`s fun1()");
    }
}
