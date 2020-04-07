package cn.itcast.PropertiesTest;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo3load {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        FileReader fr = new FileReader("D:\\javaFile\\javaProgram\\3.txt");
        pro.load(fr);

        Set<String> str = pro.stringPropertyNames();
        for (String s : str) {
            System.out.println("key"+s+"value"+pro.getProperty(s));
        }
    }
}
