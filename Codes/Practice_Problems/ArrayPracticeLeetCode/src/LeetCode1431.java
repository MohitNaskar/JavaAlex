import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
public class LeetCode1431 {
    public static void main(String[] args) {
        List<Boolean> result = new ArrayList<Boolean>();
        result = kidsWithCandies(new int[]{2,3,5,1,3},3);
        System.out.println(result);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length;i++ ){
            if (max < candies[i]){
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length;i++ ){
            if (candies[i]+extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
