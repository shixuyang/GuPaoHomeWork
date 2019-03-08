package factory.factoryMethod;

public class BMWCar implements Car {
    @Override
    public void getCarType() {
        System.out.println("这是宝马汽车");
    }
}
