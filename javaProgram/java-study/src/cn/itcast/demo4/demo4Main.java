package cn.itcast.demo4;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class demo4Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1,s2));

        String s3=null;
        System.out.println(s3==s2);
        System.out.println(s2.equals(s3));
        System.out.println(Objects.equals(s3,s2));

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        DateFormat df = new SimpleDateFormat("2020年2月2日");
        String str = df.format(date);
        System.out.println(str);

    }


}
