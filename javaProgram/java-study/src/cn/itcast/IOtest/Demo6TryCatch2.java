package cn.itcast.IOtest;

import java.io.FileWriter;
import java.io.IOException;


//jdk 7
public class Demo6TryCatch2 {
    public static void main(String[] args) {



        try(FileWriter fw = new FileWriter("D:\\javaFile\\javaProgram\\2.txt",true);){

            for (int i = 10; i <20 ; i++) {
                fw.write("hello java"+i);
                fw.write("\r\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
