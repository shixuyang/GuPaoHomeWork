package factory.abstractFactory;

public class BMWShip implements Ship{
    @Override
    public void getShipType() {
        System.out.println("宝马轮船");
    }
}
