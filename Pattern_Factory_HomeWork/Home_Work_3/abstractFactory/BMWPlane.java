package factory.abstractFactory;

public class BMWPlane implements Plane{
    @Override
    public void getPlaneType() {
        System.out.println("宝马飞机");
    }
}
