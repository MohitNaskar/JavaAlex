public class LeetCode2843 {
    public static void main(String[] args) {
        countSymmetricIntegers(1230,1231);
    }
    public static int countSymmetricIntegers(int low, int high) {
        int display = 0;
        for (int i = low; i <= high ;i++){ // to traverse through the numbers
            boolean check = checkOddOfDigits(i);
            if (check){
                boolean countSumOutput = countSum(i);
                if (countSumOutput){
                    display++;
                }
            }
        }
        return display;
    }
    public static boolean countSum(int num){
        int count = 0;
        int temp = num;
        while (temp > 0){
            temp = temp /10;
            count++;
        }
        int low = 0;
        int high = count;
        int sum = 0;
        int mid = low + (high - low) / 2;
        int leftAdd = 0;
        int rightAdd = 0;
        while (count > mid){
            leftAdd += num % 10;
            num = num / 10;
            count--;
        }
        while (count > 0){
            rightAdd += num % 10;
            num = num / 10;
            count--;
        }
        if (leftAdd == rightAdd)    return true;
        return false;
    }
    public static boolean checkOddOfDigits(int num){
        int count = 0;
        while (num > 0){
            num = num /10;
            count++;
        }
        boolean odd = true;
        if (count % 2 != 0){
            odd = false;
        }
        return odd;
    }
}
