package cn.itcast.IOtest;

import java.io.FileWriter;
import java.io.IOException;


//jdk 7 之前
public class Demo6TryCatch {
    public static void main(String[] args) {

        FileWriter fw = null;

        try{
            fw = new FileWriter("D:\\javaFile\\javaProgram\\2.txt",true);
            for (int i = 0; i <10 ; i++) {
                fw.write("hello java"+i);
                fw.write("\r\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
