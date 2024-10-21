public class SingletonAnother {
    private static SingletonAnother s3 = new SingletonAnother();

    // eager way of creating singleton object

    public static SingletonAnother getSingletonAnother() {
        return s3;
    }

}
