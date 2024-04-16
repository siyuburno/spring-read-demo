package proxy.jdk;

public class RealSubject implements Subject {
    @Override
    public void provideService() {
        System.out.println("提供服务");
    }
}
