package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyInvocationHandler implements InvocationHandler {
    private Subject realSubject;

    public DynamicProxyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.printf("提供前置增强处理\n");
        method.invoke(realSubject, args);
        System.out.printf("提供后置增强处理\n");
        return null;
    }

    public static void main(String[] args) {
        // 该设置会将动态生成的代理对象保存在文件中
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Subject realSubject = new RealSubject();
        Subject dynamicProxy = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), new Class[]{Subject.class}, new DynamicProxyInvocationHandler(realSubject));
        dynamicProxy.provideService();
    }
}
