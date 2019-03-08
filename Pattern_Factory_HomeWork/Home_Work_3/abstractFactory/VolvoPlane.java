package factory.abstractFactory;

public class VolvoPlane implements Plane{
    @Override
    public void getPlaneType() {
        System.out.println("沃尔沃飞机");
    }
}
