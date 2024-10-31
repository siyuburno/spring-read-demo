package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 后置打印的增强处理器
 */
public class PrintAfterInvocationHandler implements InvocationHandler {
    /**
     * 被代理对象
     */
    private Object object;

    /**
     * 通过构造函数的入参，将被代理对象传入
     * @param object 被代理对象
     */
    public PrintAfterInvocationHandler(Object object) {
        this.object = object;
    }

    /**
     * 后置打印日志
     * @param proxy the proxy instance that the method was invoked on
     *
     * @param method the {@code Method} instance corresponding to
     * the interface method invoked on the proxy instance.  The declaring
     * class of the {@code Method} object will be the interface that
     * the method was declared in, which may be a superinterface of the
     * proxy interface that the proxy class inherits the method through.
     *
     * @param args an array of objects containing the values of the
     * arguments passed in the method invocation on the proxy instance,
     * or {@code null} if interface method takes no arguments.
     * Arguments of primitive types are wrapped in instances of the
     * appropriate primitive wrapper class, such as
     * {@code java.lang.Integer} or {@code java.lang.Boolean}.
     *
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        System.out.printf("提供后置增强处理-------------\n");
        return result;
    }
}
