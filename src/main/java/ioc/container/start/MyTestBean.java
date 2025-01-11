package ioc.container.start;

import org.springframework.stereotype.Component;

@Component
public class MyTestBean {
    public void print() {
        System.out.println("执行 ioc.container.demo.MyTestBean.print");
    }
}
