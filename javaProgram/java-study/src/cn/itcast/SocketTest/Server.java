package cn.itcast.SocketTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ser = new ServerSocket(8887);

        Socket soc = ser.accept();

        InputStream IS = soc.getInputStream();

        String Filename = "Love" + System.currentTimeMillis() + new Random().nextInt(999999) + ".JPG";
        BufferedOutputStream BOS = new BufferedOutputStream(new FileOutputStream("E:\\serverAccept\\"+Filename));

        byte[] bytes = new byte[1024];
        int length;

        while ((length = IS.read(bytes)) != -1) {
            BOS.write(bytes,0,length);
        }

        OutputStream OS = soc.getOutputStream();
        OS.write("图片上传成功!".getBytes());
        OS.flush();
        soc.close();
        BOS.close();
        OS.close();
    }
}
