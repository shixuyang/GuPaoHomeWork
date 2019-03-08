package factory.abstractFactory;

public class BenzFactory implements Factory{
    @Override
    public Car getCar() {
        return new BenzCar();
    }

    @Override
    public Plane getPlane() {
        return new BenzPlane();
    }

    @Override
    public Ship getShip() {
        return new BenzShip();
    }
}
