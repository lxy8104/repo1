package cn.itcast.IOtest;

import java.io.FileWriter;
import java.io.IOException;

public class Demo5FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\javaFile\\javaProgram\\2.txt",true);
        fw.write("\r\n");

        fw.write(53);

        //换行
        fw.write("\r\n");

        char[] chars = {'a','b','e'};
        fw.write(chars);


        fw.flush();

        String str = "中文字符串";
        //从0开始数3个字符
        fw.write(str,0,3);

        fw.close();

    }
}
