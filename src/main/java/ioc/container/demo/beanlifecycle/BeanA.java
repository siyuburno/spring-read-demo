package ioc.container.demo.beanlifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanA implements BeanNameAware, InitializingBean, SmartInitializingSingleton, DisposableBean {
    @Autowired
    private BeanB b;

    @Override
    public void setBeanName(String name) {
        System.out.println("执行BeanNameAware的setBeanName()");
    }

    public BeanA() {
        System.out.println("执行BeanA的构造函数，此时BeanB" + (b == null ? "未初始化" : "已初始化"));
    }

    @PostConstruct
    public void init() {
        System.out.println("执行@PostConstruct标注的init()，此时BeanB" +  (b == null ? "未初始化" : "已初始化"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行InitializingBean的afterPropertiesSet()");
    }

    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("执行SmartInitializingSingleton的afterSingletonsInstantiated()");
    }

    public void use() {
        System.out.println("使用");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行destroy()");
    }
}
