package proxy.jdk;

public class RealSubject1 implements Subject {
    @Override
    public void provideService() {
        System.out.println("RealSubject1提供服务");
    }
}
