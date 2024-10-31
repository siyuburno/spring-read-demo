package proxy.jdk.demo;

import proxy.jdk.PrintAfterInvocationHandler;
import proxy.jdk.RealSubject1;
import proxy.jdk.RealSubject2;
import proxy.jdk.Subject;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class JdkDynamicProxyDemo {
    public static void main(String[] args) {
        // 该设置会将动态生成的代理对象保存在文件中
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // 生成Subject接口的实现类RealSubject1的代理对象
        Subject realSubject1 = new RealSubject1();
        Subject dynamicProxy1 = (Subject) Proxy.newProxyInstance(realSubject1.getClass().getClassLoader(), new Class[]{Subject.class}, new PrintAfterInvocationHandler(realSubject1));
        dynamicProxy1.provideService();

        // 生成Subject接口的实现类RealSubject2的代理对象
        Subject realSubject2 = new RealSubject2();
        Subject dynamicProxy2 = (Subject) Proxy.newProxyInstance(realSubject2.getClass().getClassLoader(), new Class[]{Subject.class}, new PrintAfterInvocationHandler(realSubject2));
        dynamicProxy2.provideService();

        // 生成List接口的实现类ArrayList的代理对象
        System.out.println("代理List实现类的方法：");
        List list = new ArrayList<String>();
        List listProxy = (List) Proxy.newProxyInstance(list.getClass().getClassLoader(), new Class[]{List.class}, new PrintAfterInvocationHandler(list));
        listProxy.add("1");
    }
}
