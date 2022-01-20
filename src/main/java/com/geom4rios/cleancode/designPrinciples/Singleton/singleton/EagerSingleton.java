package com.geom4rios.cleancode.designPrinciples.Singleton.singleton;

/* creating singleton eagerly and not lazily
 * Using this approach, we rely on the JVM to create the unique instance of the Singleton when the class is loaded.
 * The JVM guarantees that the instance will be created before any thread accesses the static uniqueInstance variable.
 * */
class EagerSingleton {
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {
    }

    private static EagerSingleton getInstance() {
        return uniqueInstance;
    }
}
