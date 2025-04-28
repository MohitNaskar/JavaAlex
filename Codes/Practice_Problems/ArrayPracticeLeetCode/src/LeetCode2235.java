import java.util.Arrays;

public class LeetCode2235 {
    //https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/description/?envType=problem-list-v2&envId=sorting
    public static void main (String[] args) {
        System.out.println(fillCups(new int[] {1,4,2}));
    }
    public static int fillCups(int[] amount) {
        amount = bubbleSort(amount);
        System.out.println(Arrays.toString(amount));
        int count = 0;
            while(amount[amount.length-1] > 0 && amount[amount.length-2] > 0){
                amount[amount.length-1]--;
                amount[amount.length-2]--;
                count++;
            }
//        while(amount[amount.length-1] > 0){
//            amount[amount.length-1]--;
//            count++;
//        }
        if(amount[amount.length-1] > 0){
            count += amount[amount.length-1];
        }

        return count;
    }
    public static int[] bubbleSort(int[] amount){
        boolean swaped = false;
        for(int i = 0;i <amount.length;i++){
            for(int j = 1; j < amount.length-i;j++){
                if (amount[j] < amount[j-1]){
                    swap(amount,j,j-1);
                    swaped = true;
                }
            }
            if(!swaped) break;
        }
        return amount;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
