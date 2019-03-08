package factory.factoryMethod;

public class BMWCarFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BMWCar();
    }
}
