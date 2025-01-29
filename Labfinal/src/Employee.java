//class Employee {
//    private int type ;
//    private static final int ENGINEER=0;
//    private static final int SALESMAN=0;
//    private static final int MANAGER=0;
//    private double monthlySalary;
//    private double commission;
//    private double bonus;
//
//    public Employee(int type , double salary , double commission , double bonus ){
//        this.type=type;
//        this.monthlySalary= salary;
//        this.commission= commission;
//        this.bonus=bonus;
//    }
//
//    public double payAmount(){
//        switch (this.type){
//            case ENGINEER :
//                return monthlySalary;
//            case  SALESMAN:
//                return monthlySalary+commission;
//            case MANAGER:
//                return monthlySalary+bonus;
//            default:
//                System.out.println("incorrect Employee");
//                return 0;
//        }
//    }
//
//}
//
//class TestEmployee{
//    public static void main(String[] args) {
//        Employee manager = new Employee(2,20000,5000,2500);
//        manager.payAmount();
//        Employee salesman = new Employee(1,10000,2500,1500);
//        salesman.payAmount();
//        Employee engineer = new Employee(0, 15000, 3000,2000);
//        engineer.payAmount();
//    }
//}
