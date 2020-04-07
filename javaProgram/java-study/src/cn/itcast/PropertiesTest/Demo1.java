package cn.itcast.PropertiesTest;

import java.util.Properties;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("刘馨杨", "帅哥");
        pro.setProperty("刘馨杨2", "大帅哥");
        pro.setProperty("刘馨杨3", "小帅哥");
        pro.setProperty("刘馨杨4", "超级帅哥");

        Set<String> str = pro.stringPropertyNames();
        for (String key : str) {
            System.out.println(key+"="+pro.get(key));
        }
        
    }
}
