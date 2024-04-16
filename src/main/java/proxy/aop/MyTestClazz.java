package proxy.aop;

import org.springframework.stereotype.Component;

@Component
public class MyTestClazz {
    public void test() {
        System.out.println("这是MyTestClazz在执行");
    }
}
