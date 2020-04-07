package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class NO_3 {
    public int lengthOfLongestSubstring(String s){
        int len = s.length();
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(allUnique(s,i,j)) ans = Math.max(ans, j-i);
            }
        }
        return ans;

    }

    public boolean allUnique(String s,int start, int end){
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        NO_3 no_3 = new NO_3();
        String test = "abcabcbb";
        int aa = no_3.lengthOfLongestSubstring(test);
        System.out.println(test+"的无重复字符的最长子串长度为: "+aa);
    }
}
