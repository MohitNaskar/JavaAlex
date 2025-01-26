import org.w3c.dom.ls.LSOutput;

public class PositiveNegativeZero {
    public static void checkNumber(int number)  {
        if (number < 0) {
            System.out.println("Negative number");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        if (number > 0) {
            System.out.println("Positive number");
        }
    }
}
