package factory.abstractFactory;



public class VolvoCar implements Car {
    @Override
    public void getCarType() {
        System.out.println("这是沃尔沃车");
    }
}
