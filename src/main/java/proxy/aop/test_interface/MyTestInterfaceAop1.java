package proxy.aop.test_interface;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyTestInterfaceAop1 {
    @Pointcut("execution(* proxy.aop.test_interface.MyTestInterface.fun1(..))")
    public void pt() {}

    @Before("pt()")
    public void before(JoinPoint jp) {
        System.out.println("这是前置增强");
    }

    @After("pt()")
    public void after() {
        System.out.println("这是后置增强");
    }
}
