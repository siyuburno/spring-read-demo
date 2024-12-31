package ioc.container.demo.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentB {
    @Autowired
    private ComponentA componentA;

    public ComponentB(){
        System.out.println("执行ComponentB的构造函数");
    }
}
