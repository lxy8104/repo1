package cn.itcast.demo8ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


//对象的序列化

public class Demo1ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("D:\\javaFile\\javaProgram\\5.txt"));
//        OOS.writeObject(new Person("刘馨杨",18));
//        OOS.writeObject(new Person("刘馨",17));

        Person[] people = {new Person("刘馨杨",18),new Person("刘德华",50),new Person("周杰伦",18)};
        OOS.writeObject(people);


        OOS.close();
    }
}
