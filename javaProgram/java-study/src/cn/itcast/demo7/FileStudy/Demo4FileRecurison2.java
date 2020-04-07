package cn.itcast.demo7.FileStudy;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;


public class Demo4FileRecurison2 {
    public static void main(String[] args) {

        getAllFile(new File("D:\\javaFile\\javaProgram"));
    }

    private static void getAllFile(File dir) {
//        System.out.println(dir);
        //File[] files = dir.listFiles(new FileFilterImpl());
        /*
            使用匿名内部类
         */
//        File[] files = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                if(pathname.isDirectory()){
//                    return true;
//                }
//                return pathname.getPath().endsWith(".java");
//            }
//        });



//        File[] files = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir, name).isDirectory() || new File(dir, name).getPath().endsWith(".java");
//            }
//        });



        File[] files = dir.listFiles((d,n)-> new File(d, n).isDirectory() || new File(d, n).getPath().endsWith(".java"));





        //lambda表达式
//        File[] files = dir.listFiles((File pathname)->{
//            if(pathname.isDirectory()){
//                    return true;
//                }
//                return pathname.getPath().endsWith(".java");
//        });


        for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);//递归
            }else{
                System.out.println(f);
                }
            }
        }

}
