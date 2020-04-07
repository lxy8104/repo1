package cn.itcast.IOtest;

import java.io.*;

public class Demo3CopyFile2 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Ronaldo7\\Pictures\\1.png"));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\javaFile\\javaProgram\\12.png"));


        //一个字节一个字节地读耗时26毫秒
//        int len = 0;
//        while((len=bis.read())!=-1){
//            bos.write(len);
//        }


        //用数组耗时5毫秒
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes);
        }



        bis.close();
        bos.close();

        long end = System.currentTimeMillis();
        System.out.println("复制文件耗时"+(end-start)+"毫秒");

    }
}
