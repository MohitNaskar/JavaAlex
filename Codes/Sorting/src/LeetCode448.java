import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                list.add(index+1);
            }
        }
        return list;
    }
}
