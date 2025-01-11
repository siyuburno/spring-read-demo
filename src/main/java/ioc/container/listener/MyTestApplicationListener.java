package ioc.container.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyTestApplicationListener implements ApplicationListener<MyTestEvent> {
    @Override
    public void onApplicationEvent(MyTestEvent event) {
        System.out.println(event.getSource() + "_" + event.getBiz());
    }
}
