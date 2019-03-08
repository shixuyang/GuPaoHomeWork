package factory.abstractFactory;

public class BenzShip implements Ship{
    @Override
    public void getShipType() {
        System.out.println("奔驰轮船");
    }
}
