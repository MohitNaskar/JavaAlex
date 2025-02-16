public class PrintMain {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("Initial Page count = "+printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.println("Printed Pages count = "+pagesPrinted);
    }
}
