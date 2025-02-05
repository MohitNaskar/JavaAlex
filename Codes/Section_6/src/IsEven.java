import org.w3c.dom.ls.LSOutput;

public class IsEven {
    public static void main(String[] args) {
        int j = 5;
        while(j <= 20){
            j++;
            if(isEven(j)) {
                System.out.println(j);
            }
            continue;
        }

    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
