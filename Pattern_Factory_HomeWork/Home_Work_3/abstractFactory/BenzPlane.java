package factory.abstractFactory;

public class BenzPlane implements Plane{
    @Override
    public void getPlaneType() {
        System.out.println("奔驰飞机");
    }
}
