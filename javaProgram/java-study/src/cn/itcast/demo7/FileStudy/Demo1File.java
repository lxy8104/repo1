package cn.itcast.demo7.FileStudy;

import java.io.File;

public class Demo1File {
    public static void main(String[] args) {
        String ps = File.pathSeparator;
        System.out.println(ps);

        String ss = File.separator;

        System.out.println(ss);

        File file = new File("c.txt");

        System.out.println(file);

        File file1 = new File("D:\\","readme.txt");
        System.out.println(file1);

        File file3 = new File("D:\\Java\\jdk-14\\bin\\api-ms-win-core-console-l1-1-0.dll");
        System.out.println(file3.length());
        System.out.println(file3.getAbsolutePath());//D:\Java\jdk-14\bin\api-ms-win-core-console-l1-1-0.dll
        System.out.println(file3.getPath()); //D:\Java\jdk-14\bin\api-ms-win-core-console-l1-1-0.dll
        System.out.println(file3.getName()); //api-ms-win-core-console-l1-1-0.dll

    }
}
