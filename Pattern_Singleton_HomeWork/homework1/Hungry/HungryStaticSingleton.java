package singleton.Hungry;

public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;

    static{
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }
}
