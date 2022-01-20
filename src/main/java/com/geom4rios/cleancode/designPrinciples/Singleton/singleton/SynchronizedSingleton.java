package com.geom4rios.cleancode.designPrinciples.Singleton.singleton;

/*synchronized singleton
 * Deal with multithreading scenarios were two threads enter the getInstance method
 * at the same time causing two instances to be created.*
 * */
class SynchronizedSingleton {
    private static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton(){};

    public static synchronized SynchronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
