package proxy.cglib.demo;

import org.springframework.cglib.core.DebuggingClassWriter;
import proxy.cglib.PrintBeforeProxyGenerator;
import proxy.cglib.TargetClass;

public class CglibDynamicProxyDemo {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/xiaoshu_for_back/spring-source-read");

        // 生成TargetClass的代理对象
        TargetClass target = new TargetClass();
        TargetClass proxy = (TargetClass) PrintBeforeProxyGenerator.getProxy(target);
        proxy.doSomething();
    }
}
