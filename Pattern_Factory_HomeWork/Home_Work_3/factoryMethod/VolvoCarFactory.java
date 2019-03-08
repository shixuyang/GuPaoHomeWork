package factory.factoryMethod;

public class VolvoCarFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new VolvoCar();
    }
}
