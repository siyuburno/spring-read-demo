package ioc.container.demo.beanlifecycle;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    public BeanB() {
        System.out.println("依赖注入：执行BeanB的构造函数");
    }
}
