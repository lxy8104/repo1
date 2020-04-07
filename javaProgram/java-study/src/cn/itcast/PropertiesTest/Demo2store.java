package cn.itcast.PropertiesTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo2store {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("刘馨杨", "帅哥");
        pro.setProperty("刘馨杨2", "大帅哥");
        pro.setProperty("刘馨杨3", "小帅哥");
        pro.setProperty("刘馨杨4", "超级帅哥");

        FileWriter fw = new FileWriter("D:\\javaFile\\javaProgram\\3.txt",true);
        pro.store(fw," ");


        pro.store(new FileWriter("D:\\javaFile\\javaProgram\\pro.txt"),"save data");

        fw.close();
    }
}
