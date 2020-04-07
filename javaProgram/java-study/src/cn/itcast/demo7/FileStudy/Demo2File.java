package cn.itcast.demo7.FileStudy;

import java.io.File;
import java.io.IOException;

public class Demo2File {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\javaFile\\javaProgram\\java-study\\src\\cn\\itcast\\demo7\\FileStudy\\1.txt");
        boolean newFile1 = file1.createNewFile();
        System.out.println(newFile1);


//        File file2 = new File("FileStudy\\2.txt");
//        boolean newFile2 = file2.createNewFile();
//        System.out.println(newFile2);

//        File file3 = new File("FileStudy\\新建文件夹");
//        boolean newFile3 = file3.createNewFile();
//        System.out.println(newFile3);

        file1.delete();


        File file4 = new File("D:\\javaFile\\javaProgram\\java-study\\src\\cn\\itcast\\demo7\\FileStudy\\newDirectory");
        boolean newFile4 = file4.mkdir();
        System.out.println(newFile4);

        File file5 = new File("java-study\\newDirectory4\\11\\22\\33");
        boolean newFile5 = file5.mkdirs();
        System.out.println(newFile5);
        file5.delete();
        file5.delete();
        file5.delete();


        File file6 = new File("D:\\javaFile\\javaProgram");
        String[] list = file6.list();
        for (String fileName : list) {
            System.out.println(fileName);
            
        }

        File file7 = new File("D:\\javaFile\\javaProgram\\src");
        File[] list2 = file7.listFiles();
        for (File file : list2) {
            System.out.println(file);

        }

    }
}
