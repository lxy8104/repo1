package cn.itcast.demo5;



import java.util.*;
import java.util.Scanner;

public class Demo5String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("输入字符串:");
        String str = scan.next();
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();
        for (char aChar : chars) {
            if(!hashMap.containsKey(aChar)){
                hashMap.put(aChar,1);
            }else {
                Integer count = hashMap.get(aChar);
                count++;
                hashMap.put(aChar, count);
            }
        }

        System.out.println("统计后的次数为：");
        System.out.println(hashMap);

    }
}
