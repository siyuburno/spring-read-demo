package ioc.container.bean_lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanA implements BeanNameAware, InitializingBean, SmartInitializingSingleton, DisposableBean {
    @Autowired
    private BeanB b;

    @Override
    public void setBeanName(String name) {
        System.out.println("初始化：执行BeanNameAware的setBeanName()");
    }

    public BeanA() {
        System.out.println("创建实例：执行BeanA的构造函数，此时BeanB" + (b == null ? "未初始化" : "已初始化"));
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化：执行@PostConstruct标注的init()，此时BeanB" +  (b == null ? "未初始化" : "已初始化"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化：执行InitializingBean的afterPropertiesSet()");
    }

    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("初始化：执行SmartInitializingSingleton的afterSingletonsInstantiated()");
    }

    public void use() {
        System.out.println("使用：执行use()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁：执行DisposableBean的destroy()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("销毁：执行@PreDestroyb标注的preDestroy()");
    }
}
