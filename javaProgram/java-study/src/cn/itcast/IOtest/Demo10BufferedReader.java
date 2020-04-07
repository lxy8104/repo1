package cn.itcast.IOtest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo10BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\javaFile\\javaProgram\\2.txt"));

//        int len = 0;
//        char[] chars = new char[1024];
//        while((len=br.read(chars))!=-1){
//            System.out.println(new String(chars,0,len));
//        }

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }



        br.close();
    }
}
