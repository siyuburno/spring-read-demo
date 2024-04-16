package proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class CglibDynamicProxy {
    public static Object getProxy(TargetInterface targetInterface) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetInterface.getClass());
        enhancer.setCallback((MethodInterceptor) (o, method, args, methodProxy) -> {
            System.out.println("提供前置增强处理");
            Object result = methodProxy.invokeSuper(o, args);
            System.out.println("提供后置增强处理");
            return result;
        });
        return enhancer.create();
    }

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/xiaoshu_for_back/spring-source-read");
        TargetInterface target = new TargetClass();
        TargetInterface proxy = (TargetInterface)CglibDynamicProxy.getProxy(target);
        proxy.doSomething();
    }
}
