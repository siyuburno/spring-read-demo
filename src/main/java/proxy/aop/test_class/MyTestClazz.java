package proxy.aop.test_class;

import org.springframework.stereotype.Component;

@Component
public class MyTestClazz {
    public void test(String test) {
        System.out.println("这是MyTestClazz在执行");
    }
}
