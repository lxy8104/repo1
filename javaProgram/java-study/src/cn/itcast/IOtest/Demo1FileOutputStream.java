package cn.itcast.IOtest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo1FileOutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("D:\\javaFile\\javaProgram\\2.txt",true);

        byte[] bytes = {65, 66, 67, 68, 69};
        byte[] bytes2 = {70,71,72,73};

        fos.write(bytes);
        fos.write(bytes2,1,3);
        fos.write("\r".getBytes());

        String str = "这是中文";
        byte[] strBytes = str.getBytes();
        System.out.println(Arrays.toString(strBytes));

        fos.write(strBytes);


        fos.close();

    }
}
