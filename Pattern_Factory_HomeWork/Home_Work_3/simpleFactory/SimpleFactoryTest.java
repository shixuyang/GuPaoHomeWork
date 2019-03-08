package factory.simpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CarSimpleFactory carSimpleFactory = new CarSimpleFactory();
        Car myCar = carSimpleFactory.getCar(BenzCar.class);
        myCar.getCarType();
    }
}
