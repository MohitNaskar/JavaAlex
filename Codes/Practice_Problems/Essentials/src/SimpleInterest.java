import java.util.Scanner;

public class SimpleInterest {
    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int time = sc.nextInt();
        double rate = sc.nextInt();
        int simpleInterest = 0;

        simpleInterest = (int) (principle + (time * (rate / 100) * principle));
        System.out.println(simpleInterest);
    }
}
