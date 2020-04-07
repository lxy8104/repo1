package cn.itcast.IOtest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo8BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\javaFile\\javaProgram\\4.txt");
        BufferedInputStream bi = new BufferedInputStream(fis);
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len=bi.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        bi.close();
    }
}
