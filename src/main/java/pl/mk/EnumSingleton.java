package pl.mk;

public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    /**
     compiled as final !
     */
    public static void doSth() {
        //staff
    }
}
