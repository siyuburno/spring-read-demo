package proxy.cglib;

public class TargetClass implements TargetInterface {
    @Override
    public void doSomething() {
        System.out.println("提供服务");
    }
}
