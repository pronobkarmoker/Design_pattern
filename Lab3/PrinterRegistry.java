package Lab3;

public class PrinterRegistry {

    private static Printer salesPrinter;
    private static Printer marketingPrinter;
    private static Printer itPrinter;

    public static Printer getSalesPrinter() {
        if (salesPrinter == null) {
            salesPrinter = Printer.createPrinter("Sales");
        }
        return salesPrinter;
    }

    public static Printer getMarketingPrinter() {
        if (marketingPrinter == null) {
            marketingPrinter = Printer.createPrinter("Marketing");
        }
        return marketingPrinter;
    }

    public static Printer getITPrinter() {
        if (itPrinter == null) {
            itPrinter = Printer.createPrinter("IT");
        }
        return itPrinter;
    }
}
