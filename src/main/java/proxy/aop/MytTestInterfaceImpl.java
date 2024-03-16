package proxy.aop;

import org.springframework.stereotype.Component;

@Component
public class MytTestInterfaceImpl implements MyTestInterface {
    @Override
    public void test() {
        System.out.println("这是MytTestInterfaceImpl在执行");
    }
}
