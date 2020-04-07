package cn.itcast.IOtest;

import java.io.FileReader;
import java.io.IOException;

public class Demo4FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\javaFile\\javaProgram\\2.txt");
//        int len = 0;
//        while((len=fr.read())!=-1){
//            System.out.print((char)len);
//        }

        char[] chars = new char[1024];

        int len = 0;
        while((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

        fr.close();


    }
}
