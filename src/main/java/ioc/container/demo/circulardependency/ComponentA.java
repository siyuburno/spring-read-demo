package ioc.container.demo.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentA {
    @Autowired
    private ComponentB componentB;

    public ComponentA() {
        System.out.println("执行ComponentA的构造函数");
    }
}
