package pl.mk;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

@Singleton
public class AnnotatedSingleton {

    private static AnnotatedSingleton INSTANCE;

    @PostConstruct
    public static void start() {
        System.out.println("start");
        INSTANCE = new AnnotatedSingleton();
    }

    public static AnnotatedSingleton getInstance() {
        return INSTANCE;
    }
}
