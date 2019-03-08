package factory.abstractFactory;

public class VolvoFactory implements Factory{
    @Override
    public Car getCar() {
        return new VolvoCar();
    }

    @Override
    public Plane getPlane() {
        return new VolvoPlane();
    }

    @Override
    public Ship getShip() {
        return new VolvoShip();
    }
}
