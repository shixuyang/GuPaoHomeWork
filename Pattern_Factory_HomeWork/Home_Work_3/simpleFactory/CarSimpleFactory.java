package factory.simpleFactory;

public class CarSimpleFactory {
    public Car getCar(Class clzz){
        try{
            if(clzz != null) {
                return (Car) clzz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
