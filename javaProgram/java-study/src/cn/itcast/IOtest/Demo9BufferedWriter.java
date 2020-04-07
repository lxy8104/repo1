package cn.itcast.IOtest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo9BufferedWriter {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\javaFile\\javaProgram\\2.txt",true));
        for (int i = 0; i <5 ; i++) {
            bw.write("第"+i+"次增加的字符串");
            bw.newLine();
        }
        bw.write("这是通过BufferedWriter添加的字符串嘻嘻");
        bw.close();
    }
}
