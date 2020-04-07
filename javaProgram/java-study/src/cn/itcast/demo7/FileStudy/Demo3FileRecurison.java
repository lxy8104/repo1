package cn.itcast.demo7.FileStudy;

import java.io.File;



public class Demo3FileRecurison {
    public static void main(String[] args) {
        getAllFile(new File("D:\\javaFile\\javaProgram"));
    }

    private static void getAllFile(File dir) {
//        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);//递归
            }else{
                String name = f.getName();//***.java
//                String name = f.getPath();//D:\\**\\**\\**.java
                //String name = f.toString();//D:\\**\\**\\**.java
                if(name.toLowerCase().endsWith(".java")){
                    System.out.println(f);
                }
            }
        }
    }
}
