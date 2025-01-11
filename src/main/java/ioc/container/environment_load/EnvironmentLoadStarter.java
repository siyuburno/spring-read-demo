package ioc.container.environment_load;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnvironmentLoadStarter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("ioc.container.environment_load");
        ConfigPrinter configPrinter = applicationContext.getBean(ConfigPrinter.class);
        System.out.println(configPrinter.getPath() + ":" + configPrinter.getName());
    }
}
