package cn.itcast.demo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo5ComparatorTest {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(new Student("lxy", 17));
        list1.add(new Student("lxy", 11));
        list1.add(new Student("lxy", 15));
        list1.add(new Student("lxy", 10));

        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                return s1.getAge()-s2.getAge();//升序排列
            }
        });
        System.out.println(list1);
    }
}
