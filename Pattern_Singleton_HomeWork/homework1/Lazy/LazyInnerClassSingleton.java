package singleton.Lazy;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){}

    public static LazyInnerClassSingleton getInstance(){
        return lazyHolder.lazyInner;
    }

    private static class lazyHolder{
        private static final LazyInnerClassSingleton lazyInner = new LazyInnerClassSingleton();
    }
}
