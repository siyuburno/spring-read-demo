package proxy;

public class LandLordProxy implements RentHouse {
    private LandLord landLord;

    public LandLordProxy(LandLord landLord) {
        this.landLord = landLord;
    }
    @Override
    public void rentHouse(String contractNum, String name) {
        System.out.printf("中介联系%s，带%s看房\n", name, name);
        System.out.printf("中介和%s签合同，合同编号是[%s]\n",name,contractNum);
        landLord.rentHouse(contractNum, name);
        System.out.printf("中介给%s钥匙\n", name);
        System.out.printf("中介给%s提供善后服务，如修理灯泡\n", name);
    }

    public static void main(String[] args) {
        LandLordProxy landLordProxy = new LandLordProxy(new LandLord());
        landLordProxy.rentHouse("test1234", "李增清");
    }
}
