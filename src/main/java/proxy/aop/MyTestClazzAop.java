package proxy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyTestClazzAop {
    @Pointcut("execution(* proxy.aop.MyTestClazz.test(..))")
    public void pt(){}


    @Before("pt()")
    public void before(JoinPoint jp) {
        System.out.println("这是前置增强");
    }

    @After("pt()")
    public void after() {
        System.out.println("这是后置增强");
    }
}
