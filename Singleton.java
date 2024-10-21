public class Singleton {

    private static Singleton s;

    // constructor
    private Singleton() {

    }

    // lazy way of creating single obj
    public static Singleton getSingleton() {
        // object of this class
        // Singleton s = new Singleton();
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}