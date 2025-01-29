// Testing the refactored implementation
class TestEmployee {
    public static void main(String[] args) {
        Employee manager = new Manager(20000, 2500);
        System.out.println("Manager Pay: " + manager.payAmount());

        Employee salesman = new Salesman(10000, 2500);
        System.out.println("Salesman Pay: " + salesman.payAmount());

        Employee engineer = new Engineer(15000);
        System.out.println("Engineer Pay: " + engineer.payAmount());
    }
}