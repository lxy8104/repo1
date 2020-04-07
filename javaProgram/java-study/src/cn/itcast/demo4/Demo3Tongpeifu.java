package cn.itcast.demo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.TreeSet;
import java.util.*;

public class Demo3Tongpeifu {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("lxy");
        list2.add("zk");

        printArray(list1);
        printArray(list2);

        System.out.println(Arrays.asList(new int[]{1,2,3}).getClass());
        System.out.println(Arrays.asList(new Integer[]{1,2,3}).getClass());

        int[] test = {9,8,7};
        Set<Integer> list3 = new TreeSet<Integer> (Arrays.asList(new Integer[]{1,2,3}));
        list3.add(3);
        list3.add(3);
        list3.add(4);

        printArray(list3);

    }

    public static void printArray(ArrayList<?> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

    public static void printArray(Set<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
