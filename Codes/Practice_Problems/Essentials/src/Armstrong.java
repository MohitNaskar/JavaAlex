import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
        int result = isArmstrong(num1);
        if (num1 == result){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
    static int isArmstrong(int num1) {
        int count = 0;
        int temp = num1;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int result = 0;
        while (num1 != 0) {
            result += (int) Math.pow(num1 % 10, count);
            num1 = num1 / 10;
        }
        return result;
    }
}
