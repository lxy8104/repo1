package cn.itcast.demo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        String str ="abdcas";
        ArrayList<String> test = new ArrayList<>(Arrays.asList(str));
        Iterator iterator = test.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
