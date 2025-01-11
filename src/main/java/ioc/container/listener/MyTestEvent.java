package ioc.container.listener;

import org.springframework.context.ApplicationEvent;

public class MyTestEvent extends ApplicationEvent {
    private String biz;

    public MyTestEvent(Object source, String biz) {
        super(source);
        this.biz = biz;
    }

    public String getBiz() {
        return biz;
    }
}
