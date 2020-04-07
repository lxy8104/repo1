package cn.itcast.demo5;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet();
        Person p1 = new Person("lxy", 18);
        Person p2 = new Person("lxy", 18);
        Person p3 = new Person("lxy", 19);

        System.out.println(p1.hashCode()); //哈希值为3337478
        System.out.println(p2.hashCode()); //哈希值为3337478   p1和p2的哈希值一样

        System.out.println(p1==p2);//false  地址不同

        System.out.println(p1.equals(p2));//true  Person类重写了equals方法



        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
