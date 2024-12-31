package ioc.container.demo.circulardependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularDependencyTestStarter {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("ioc.container.demo.circulardependency");
    }
}
