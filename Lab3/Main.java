package Lab3;

public class Main {
    public static void main(String[] args) {

        Printer salesPrinter = PrinterRegistry.getSalesPrinter();
        Printer marketingPrinter = PrinterRegistry.getMarketingPrinter();
        Printer itPrinter = PrinterRegistry.getITPrinter();

        salesPrinter.print("Sales Report");
        marketingPrinter.print("Marketing doc");
        itPrinter.print("SPL2 proposal");

        Printer anotherSalesPrinter = PrinterRegistry.getSalesPrinter();

        System.out.println(salesPrinter == anotherSalesPrinter);

        anotherSalesPrinter.print("Sales dept");
    }
}
