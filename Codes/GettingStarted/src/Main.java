//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        double x = 20.00;
        double y = 80.00;
        double result = x + y * 100.00;
        double result2 = result % 40.00;
        System.out.println(result2);

        boolean z = (result2 == 0.0) ? true : false;
        System.out.println(z);
        if (!z) {
            System.out.println("Got some remainder");
        }
    }
}