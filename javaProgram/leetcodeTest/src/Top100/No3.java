package Top100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
**无重复字符最长子串
*TOP100第三题
*
*
 */
public class No3 {
    /*
    方法1  暴力法   会超出时间限制
     */
    public static int lengthOfLongestSubstring1(String s) {
        int ans = 0;
        int len = s.length();
        for (int i = 0; i <len ; i++) {
            for (int j = i + 1; j <= len ; j++) {
                if (allUnique(s,i,j)) ans = Math.max(ans, j - i);

            }

        }
        return ans;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i =start; i <end ; i++) {
            Character ch = s.charAt(i);
            if(set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }

    public static int lengthOfSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans=0,i=0,j=0;
        while(i<n && j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }else{
                set.remove(s.charAt(i++));

            }
        }

        return ans;
    }
    /*
    abc,bcade,cade,adec,dec,ec,c
    set{a,b,c,} ----{b,c} i=1;  ---{b,c,a} ----{b,c,a,d} 5-1=4, ----{b,c,a,d,e} 6-1=5, {c,a,d,e}i=2, {a,d,e} i=3, {a,d,e,c}
     */



    public static void main(String[] args) {
        String ts = "abcabcbb";
        System.out.println(ts.substring(0,2));
        int i =0;
        System.out.println(ts.charAt(i++));
        System.out.println(i);
        //System.out.println(ts.charAt(ts.length()));
        System.out.println(" ".length());
        System.out.println(lengthOfSubstring2(ts));

        Map<Character,Integer> map = new HashMap<>(){{
            put('a',2);
            put('b',3);
            put('c',4);

        }};

    }
}
