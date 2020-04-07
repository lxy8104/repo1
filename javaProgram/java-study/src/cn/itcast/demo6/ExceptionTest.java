package cn.itcast.demo6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    /*
        FileNotFoundException extends IOException extends Exception
        如果抛出的多个异常对象有父子关系，那么直接声明父类异常即可
     */

    //public static void main(String[] args) throws FileNotFoundException,IOException {
    //public static void main(String[] args) throws IOException {
    public static void main(String[] args) throws Exception {
        try{
            readFile("c:\\a.txt");//如果出现异常就不执行try代码块的下面的代码，如果没出现异常会执行
            System.out.println("aaa");
        }catch (IOException e){
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }

    }

    private static void readFile(String fileName) throws IOException {
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件不是c:\\a.txt");
        }
        /*
                如果传递的路径不是以txt结尾的
                那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
         */
        if(!fileName.endsWith("txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("文件名称没有问题");
    }

}
