package cn.itcast.IOtest;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream os = new FileOutputStream("D:\\javaFile\\javaProgram\\4.txt");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        os.write("我把数据写入内存缓冲区".getBytes());
        os.close();

    }
}
