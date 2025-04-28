public class LeetCode242 {
    //https://leetcode.com/problems/valid-anagram/?envType=problem-list-v2&envId=sorting
    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(count[i] != 0) return false;
        }
        return true;
    }
}
