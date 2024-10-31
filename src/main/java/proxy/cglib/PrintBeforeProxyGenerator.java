package proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class PrintBeforeProxyGenerator {
    /**
     * 生成前置打印的代理类
     * @param targetInterface
     * @return
     */
    public static Object getProxy(Object targetInterface) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetInterface.getClass());
        enhancer.setCallback((MethodInterceptor) (o, method, args, methodProxy) -> {
            System.out.println("提供前置增强处理");
            Object result = methodProxy.invokeSuper(o, args);
            return result;
        });
        return enhancer.create();
    }
}
