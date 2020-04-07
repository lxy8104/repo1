package cn.itcast.IOtest;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo2FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\javaFile\\javaProgram\\2.txt");

//        int read = fis.read();
//        while(read!=-1){
//            System.out.println((char)read);
//            read = fis.read();
//        }

//        byte[] bytes = new byte[3];
//        fis.read(bytes);
//        //System.out.println(len);
//        System.out.println(new String(bytes));

        byte[] bytes2 = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes2) )!= -1) {
            System.out.println(new String(bytes2,0, len));
        }


        fis.close();
    }
}
