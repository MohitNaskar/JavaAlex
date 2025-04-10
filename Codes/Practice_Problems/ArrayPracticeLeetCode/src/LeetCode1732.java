public class LeetCode1732 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int[] res = new int[gain.length + 1];
        int max = 0;
        res[0] = 0;
        for (int i = 0; i < gain.length ;i++){
            res[i+1] = res[i] + gain[i];
            if(res[i+1] > max){
                max = res[i+1];
            }
        }
        return max;
    }
}
