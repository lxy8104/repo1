package cn.itcast.demo5;

import java.util.HashMap;
import java.util.Map;

public class Demo5HashMapTest {
    public static void main(String[] args) {
        HashMap<Worker,String> list = new HashMap<>();
        list.put(new Worker("刘馨杨",18),"重庆邮电大学");
        list.put(new Worker("刘馨杨",19),"重庆邮电大学2");
        list.put(new Worker("刘馨杨",18),"重庆邮电大学3");


        //如果不对Worker类重写hashCode和equals方法，就会导致Worker类作为Map中key值时，不能保证key的唯一性


        for (Map.Entry<Worker,String> entry:list.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }


        HashMap<Integer, String> hp = new HashMap<>();
        hp.put(3, "老三");
        hp.put(2, "老二");
        hp.put(1, "老大");
        hp.put(4, "老四");

        for (Integer i:hp.keySet()){
            String value = hp.get(i);
            System.out.println("key:"+i+"value"+value);
        }

    }
}
