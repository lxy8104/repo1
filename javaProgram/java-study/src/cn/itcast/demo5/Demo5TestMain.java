package cn.itcast.demo5;

import java.util.ArrayList;
import java.util.Collections;

public class Demo5TestMain {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(3);
        list1.add(7);


        ArrayList<Integer> list = new ArrayList<>(list1);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Person> list3 = new ArrayList<>();
        list3.add(new Person("lxy", 17));
        list3.add(new Person("lxy", 11));
        list3.add(new Person("lxy", 15));
        list3.add(new Person("lxy", 10));

        Collections.sort(list3);
        System.out.println(list3);
    }
}
