package Lab3;

public class Printer {
    private String department;

    private Printer(String department) {
        this.department = department;
        System.out.println("Printer created for " + department + " department.");
    }

    public void print(String document) {
        System.out.println("Printing '" + document + "' for " + department + " department.");
    }

    static Printer createPrinter(String department) {
        return new Printer(department);
    }
}
