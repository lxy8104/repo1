
package StackoverflowJava;
import java.lang.reflect.Array;
import java.util.*;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        String s = "avcd";
        String v = s.concat("ef");



        System.out.println(s); //avcd
        System.out.println(v); //acvdef
        String[] array = {"a","b","c"};
        ArrayList<String> array2 = new ArrayList<String>(Arrays.asList(array));
        ArrayList<Integer> array3 = new ArrayList<Integer>(Arrays.asList(new Integer[]{12,21}));
        System.out.println(array2);     //abc
        array2.add("d");
        //array2.add(array3);
        System.out.println(array2);     //abcd
        System.out.println(array2.contains("a")); //true
        array2.set(1, "asd");
        System.out.println(array2);    //a asd c d
        Collections.addAll(array2, array);
        System.out.println(array2);     //a asd c d a b c
        Integer[] ints = { 1, 2, 3, 4, 5 };
        List<Integer> list = Arrays.asList(ints);

        list.add(6);//Array.asList得到的list不可变 不能进行add()，remove()，clear()
        // 这个ArrayList不是java.util包下的，而是java.util.Arrays.ArrayList它是Arrays类自己定义的一个静态内部类，这个内部类没有实现add()、remove()方法，而是直接使用它的父类AbstractList的相应方法。
        //如果你的List只是用来遍历，就用Arrays.asList()。如果你的List还要添加或删除元素，还是乖乖地new一个java.util.ArrayList，然后一个一个的添加元素。


        List<Integer> list2 = List.of(1,2,3);


    }

}
