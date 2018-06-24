package pl.mk;

public class TheSingleton {

    //see: Auto ThreadSafe Singleton Pattern
    private static final Object instance = new Object();

    protected TheSingleton() {
    }

    // Runtime initialization, by default ThreadSafe
    public static Object getInstance() {
        return instance;
    }
}
