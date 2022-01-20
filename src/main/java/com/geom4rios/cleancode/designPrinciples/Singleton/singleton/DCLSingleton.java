package com.geom4rios.cleancode.designPrinciples.Singleton.singleton;

/* Double Checked Locking
 *
 * Check for an instance and if there isn't one then enter a synchronized block.
 * We only synchronize the first time through, once in the block check again and if is still null then create a new instance.
 *
 * */
class DCLSingleton {
    /*the volatile keyword ensures that multiple threads handle the uniques instance variable correctly when it's being initialized to the Singleton instance. */
    private volatile static DCLSingleton uniqueInstance;

    private DCLSingleton() {
    }

    private static DCLSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DCLSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DCLSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
