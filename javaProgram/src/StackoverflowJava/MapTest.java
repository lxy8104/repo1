package StackoverflowJava;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(1,"a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(1, "as");

        System.out.println(map.keySet().getClass());

//        Set<Map.Entry<Integer, String>> entries1 = map.entrySet();

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("keys:"+ entry.getKey() + "values:" + entry.getValue());
        }

        for (Integer key : map.keySet()) {
            System.out.println("key = " + map.get(key));
        }
        for (String value : map.values()) {
            System.out.println("value = " + value);
        }

        Iterator<Map.Entry<Integer,String>> entries  = map.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer,String> entry = entries.next();
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key = " + key + "value = "+value);
        }

        map.forEach((k,v)->System.out.println("keys:"+ k + "value: " + v));


        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }


        List<Integer> test = List.of(1, 2, 3, 4, 5);
        test.forEach((i)->System.out.println(i));


       Map<String,Integer> map2 = new TreeMap<String,Integer>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
//          map2.put(new Person("刘馨杨",18),1);
////        map2.put(new Person("刘馨杨",18),2);
////        map2.put(new Person("刘洋",16),3);
////        map2.put(new Person("刘杨",13),4);

        map2.put("刘馨杨", 1);
        map2.put("刘德华", 3);
        map2.put("张国荣", 2);
        map2.put("周润发", 5);
        map2.put("周杰伦", 4);



        map2.forEach((p,v)-> System.out.println("Person:"+p+"编号"+v));
        for(Map.Entry<String,Integer> entry:map2.entrySet()){
            System.out.println(entry.getKey());
        }

//        Collections.sort((List)(map2.entrySet()), new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });


        Map<Person,Integer> map3 = new TreeMap<Person,Integer>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });



        map3.put(new Person("刘馨杨",18),1);
        map3.put(new Person("刘馨杨",18),2);//key重复，覆盖第一次的
        map3.put(new Person("刘洋",16),3);
        map3.put(new Person("刘杨",19),4);

        map3.forEach((p,v)->{
            System.out.println("Person"+p+"编号为"+v);
        });

        Map<Person,Integer> map4 = new HashMap<Person,Integer>();

        map4.put(new Person("lxy",18),1);
        map4.put(new Person("lxy",18),2);//key重复，覆盖第一次的
        map4.put(new Person("ljj",16),3);
        map4.put(new Person("zjy",19),4);

        //先把map中的键值对转换成List中，这样就可以使用Collection.sort()方法。
        List<Map.Entry<Person, Integer>> list = new ArrayList<>(map4.entrySet());

        System.out.println(list);

        Collections.sort(list,(Map.Entry<Person,Integer> o1, Map.Entry<Person,Integer> o2)-> {
                return o1.getKey().getAge()-o2.getKey().getAge();
        });
        System.out.println(list);


    }
}
