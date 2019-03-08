package factory.abstractFactory;

public class BMWFactory implements Factory{
    @Override
    public Car getCar() {
        return  new BMWCar();
    }

    @Override
    public Plane getPlane() {
        return new BMWPlane();
    }

    @Override
    public Ship getShip() {
        return new BMWShip();
    }
}
