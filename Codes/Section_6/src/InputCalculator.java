import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int average = 0;
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                int number = scanner.nextInt();
                sum += number;
                average = (int) Math.round((double) sum / count);
                count++;
            }catch(InputMismatchException e){
                System.out.println("SUM = " +sum + " AVG =" +  average);
                break;
            }
        }
    }
}
