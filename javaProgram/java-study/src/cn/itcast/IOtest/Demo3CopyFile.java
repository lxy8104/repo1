package cn.itcast.IOtest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3CopyFile {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\Users\\Ronaldo7\\Pictures\\1.png");

        FileOutputStream fos = new FileOutputStream("D:\\javaFile\\javaProgram\\3.png");


        //一次读一个字节耗时很久 耗时7264毫秒
        int len =0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }


        //用数组形势耗时12毫秒
//        int len =0;
//        byte[] bytes = new byte[1024];
//        while((len=fis.read(bytes))!=-1){
//            fos.write(bytes,0,len);
//        }


        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println("一共耗时"+(end-start)+"毫秒");

    }
}
