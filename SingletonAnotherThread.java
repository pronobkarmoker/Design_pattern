public class SingletonAnotherThread {

    private static SingletonAnotherThread s;

    // constructor
    private SingletonAnotherThread() {

    }

    // lazy way of creating single obj
    public static SingletonAnotherThread getSingletonAnotherThread() {
        // object of this class
        // Singleton s = new Singleton();
        if (s == null) {

            synchronized (SingletonAnotherThread.class) {
                if (s == null) {
                    s = new SingletonAnotherThread();
                }
            }
        }
        return s;

    }
}
