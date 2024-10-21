public class Example {
    public static void main(String[] args) {

        // new Singleton(); private tai use kora jay na
        Singleton s = Singleton.getSingleton();
        System.out.println(s.hashCode());

        Singleton s2 = Singleton.getSingleton();
        System.out.println(s2.hashCode());

        System.out.println(SingletonAnother.getSingletonAnother().hashCode());
        System.out.println(SingletonAnother.getSingletonAnother().hashCode());

    }
}

/*
 * to break singleton pattern
 * 
 * 1. reflection api to break singleton pattern
 * 
 * 
 */
