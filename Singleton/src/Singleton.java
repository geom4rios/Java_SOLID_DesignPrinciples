/*simple singleton */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){};

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

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

/* other ways to deal with multithreading scenarios */

/* creating singleton eagerly and not lazily
* Using this approach, we rely on the JVM to create the unique instance of the Singleton when the class is loaded.
* The JVM guarantees that the instance will be created before any thread accesses the static uniqueInstance variable.
* */
class EagerSingleton {
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {}

    private static EagerSingleton getInstance() {
        return uniqueInstance;
    }
}

/* Double Checked Locking
*
* Check for an instance and if there isn't one then enter a synchronized block.
* We only synchronize the first time through, once in the block check again and if is still null then create a new instance.
*
* */
class DCLSingleton {
    /*the volatile keyword ensures that multiple threads handle the uniques instance variable correctly when it's being initialized to the Singleton instance. */
    private volatile static DCLSingleton uniqueInstance;

    private DCLSingleton () {}

    private static DCLSingleton getInstance() {
        if(uniqueInstance == null) {
            synchronized (DCLSingleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new DCLSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}