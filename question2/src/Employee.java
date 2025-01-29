// Abstract Base Class
abstract class Employee {
    protected double monthlySalary;

    public Employee(double salary) {
        this.monthlySalary = salary;
    }

    // Abstract method for calculating pay amount
    public abstract double payAmount();
}
