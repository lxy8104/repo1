package cn.itcast.demo4;

import java.util.Arrays;
import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();
        System.out.println(c);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int date = c.get(Calendar.DATE);
        System.out.println(date);

        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));


        StringBuilder bu1 = new StringBuilder("abc");
        System.out.println(bu1);

        int i1 =100;
        String s1 = i1 + "";
        System.out.println(s1 + 200);

        String s2 = Integer.toString(i1);
        System.out.println(s2+200);

        String s3 = String.valueOf(i1);
        System.out.println(s3+200);

        int i = Integer.parseInt(s1);
        System.out.println(i);




    }
}
