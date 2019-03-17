package singleton.Lazy;

public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton(){}

    public static synchronized LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton==null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return  lazySimpleSingleton;
    }


}
