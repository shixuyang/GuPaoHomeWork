package factory.factoryMethod;

public class BenzCar implements Car {
    @Override
    public void getCarType() {
        System.out.println("这是奔驰车");
    }
}
