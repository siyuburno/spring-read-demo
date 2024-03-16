package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicLandLordProxy implements InvocationHandler {
    private RentHouse landLord;

    public DynamicLandLordProxy(RentHouse landLord) {
        this.landLord = landLord;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object contractNum = args[0];
        Object name = args[1];
        System.out.printf("中介联系%s，带%s看房\n", name, name);
        System.out.printf("中介和%s签合同，合同编号是[%s]\n",name,contractNum);
        method.invoke(landLord, args);
        System.out.printf("中介给%s钥匙\n", name);
        System.out.printf("中介给%s提供善后服务，如修理灯泡\n", name);
        return null;
    }

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        LandLord landLord = new LandLord();
        RentHouse landLordProxy = (RentHouse) Proxy.newProxyInstance(landLord.getClass().getClassLoader(), new Class[]{RentHouse.class}, new DynamicLandLordProxy(landLord));
        landLordProxy.rentHouse("test1234","李增清");
    }
}
