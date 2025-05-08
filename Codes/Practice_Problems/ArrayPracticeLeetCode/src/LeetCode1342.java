public class LeetCode1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        return countSteps(num,0);

    }
    public static int countSteps(int num,int count){
        if(num == 0)    return count;
        return (num % 2 == 0) ? countSteps(num/2,count +1) : countSteps(num-1,count +1);
    }
}
