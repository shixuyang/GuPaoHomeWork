package factory.factoryMethod;

public class factoryMethodTest {
    public static void main(String[] args) {
        CarFactory factory = new BenzCarFactory();
        factory.getCar().getCarType();
    }
}
