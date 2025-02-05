public class SumOdd {
    public static void main(String[] args) {
    }
    public static boolean isOdd(int num){
        if(num > 0){
            return num % 2 == 1;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if( start <= end && start > 0 && end > 0 ){
            for (int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
