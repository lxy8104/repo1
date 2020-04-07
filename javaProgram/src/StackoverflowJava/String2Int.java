package StackoverflowJava;

public class String2Int {
    public static void main(String[] args) {
        String s = "2222";
        Integer integer = Integer.valueOf(s);
        System.out.println(integer);
        int i = Integer.parseInt(s);
        System.out.println(i);

        int foo,foo1;
        String s1 = "hello2019";
        String s2 = "2019";
        try {
            foo = Integer.parseInt(s1);
            System.out.println(foo);
        }catch(NumberFormatException e){
            System.out.println("cannot convert to int");
        }

        try{
            foo1 = Integer.parseInt(s2);
            System.out.println(foo1);
        }catch (NumberFormatException e){
            System.out.println("cannot convert to int");
        }
    }
}
