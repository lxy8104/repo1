package cn.itcast.demo4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        String a = "abc";
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(a));
//        linkedList.addFirst("bbb");
//        linkedList.addLast("last");

        String first = linkedList.getFirst();
        System.out.println(first);

        HashSet hashSet = new HashSet<>();
        String s1 = "abc";
        String s2 = "abc";
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add("通话");
        hashSet.add("重地");
        System.out.println("通话".hashCode());//“通话”和“重地”的哈希值一样
        System.out.println("重地".hashCode());
        System.out.println(hashSet);
    }
}
