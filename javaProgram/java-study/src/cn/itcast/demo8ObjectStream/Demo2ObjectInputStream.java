package cn.itcast.demo8ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;


//反序列化

public class Demo2ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\javaFile\\javaProgram\\5.txt"));
        Object[] o = (Object[])ois.readObject();
        for (Object o1 : o) {
            System.out.println(o1);
            
        }
        ois.close();



    }
}
