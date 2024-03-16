package proxy;

public class LandLord implements RentHouse {
    @Override
    public void rentHouse(String contractNum, String name) {
        System.out.printf("%s想要租房，合同编号是[%s]\n", name, contractNum);
    }

    public static void main(String[] args) {
        LandLord landLord = new LandLord();
        landLord.rentHouse("test1234","李增清");
    }
}
