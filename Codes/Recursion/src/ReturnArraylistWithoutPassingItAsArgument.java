import java.util.ArrayList;

public class ReturnArraylistWithoutPassingItAsArgument {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,6};
        System.out.println(returnArraylistWithoutPassingItAsArgument(arr,4,0));
    }
    public static ArrayList<Integer> returnArraylistWithoutPassingItAsArgument(int[] arr,int target,int index) {
        ArrayList list = new ArrayList();
        if (index == arr.length)    return list;
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> tempList = returnArraylistWithoutPassingItAsArgument(arr, target, index + 1);
        list.addAll(tempList);
        return list;

    }
}
