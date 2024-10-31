package proxy.jdk;

public class RealSubject2 implements Subject {
    @Override
    public void provideService() {
        System.out.println("RealSubject2提供服务");
    }
}
