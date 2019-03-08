package factory.abstractFactory;

public class VolvoShip implements Ship{
    @Override
    public void getShipType() {
        System.out.println("沃尔沃轮船");
    }
}
