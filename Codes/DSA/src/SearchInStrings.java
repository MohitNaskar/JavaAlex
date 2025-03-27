import java.sql.SQLOutput;
import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        char target = 'u';
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target) {
                System.out.println("Character found at index " + i);
            }
            else {
                System.out.println("Character not found");
            }
        }
    }
}
