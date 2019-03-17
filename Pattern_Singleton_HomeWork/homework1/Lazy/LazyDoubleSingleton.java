package singleton.Lazy;

public class LazyDoubleSingleton {
    private static LazyDoubleSingleton lazyDoubleSingleton = null;

    private LazyDoubleSingleton(){}

    public static LazyDoubleSingleton getInstance(){
        if(lazyDoubleSingleton==null){
            synchronized (LazySimpleSingleton.class){
                if(lazyDoubleSingleton == null){
                    lazyDoubleSingleton = new LazyDoubleSingleton();
                }
            }
        }
        return  lazyDoubleSingleton;
    }

}
