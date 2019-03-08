package factory.abstractFactory;

public class abstractFactoryTest {
    public static void main(String[] args) {
        Factory factory = new VolvoFactory();
        factory.getCar().getCarType();
        factory.getPlane().getPlaneType();
        factory.getShip().getShipType();
    }
}
