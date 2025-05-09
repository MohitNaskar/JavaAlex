public class LeetCode344 {
    public static void main (String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start < end){

            if(s[start] == s[start+1] && (start+1) == end){
                start++;
                end--;
                continue;
            }

            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
