package com.geom4rios.cleancode.designPrinciples.Singleton.singleton;

/*simple singleton */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    };

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
