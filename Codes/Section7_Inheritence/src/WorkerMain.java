public class WorkerMain {
    public static void main(String[] args) {
        Employee Mohit = new Employee("Mohit","11/11/1985","01/01/2020");
        System.out.println(Mohit);
        System.out.println(Mohit.getAge());
        SalariedEmployee Abhi = new SalariedEmployee("Abhi","11/11/1985","01/01/2020",20000.0);
        System.out.println(Abhi);
        System.out.println(Abhi.collectPay());
        Abhi.retire();
        System.out.println(Abhi.collectPay());
    }
}
