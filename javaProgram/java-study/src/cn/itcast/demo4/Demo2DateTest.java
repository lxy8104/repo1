package cn.itcast.demo4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo2DateTest {
    public static void main(String[] args) throws ParseException {
        System.out.print("输入你的出生日期:");
        Scanner scan = new Scanner(System.in);
        String birth = scan.next();
        //把字符串的出生日期转换成Date类，再通过getTime转换为出生日期毫秒数 通过DateFormat将String转换成Date类  这样就可以计算出出生日期离1970年的毫秒数
        DateFormat df = new SimpleDateFormat(birth);
        Date birthDate = df.parse(birth);

        System.out.println(df);

        long birthTime = birthDate.getTime();

        //算出当前日期的毫秒数
        long currentTime = new Date().getTime();

        long currentLifeTime = (currentTime-birthTime)/(1000*60*60*24);
        System.out.println("你已经出生了"+currentLifeTime+"天");



    }
}
