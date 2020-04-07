package cn.itcast.SocketTest;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(),8887);
        OutputStream os = socket.getOutputStream();

        BufferedInputStream FIS = new BufferedInputStream(new FileInputStream("C:\\Users\\Ronaldo7\\Pictures\\spiderMan.JPG"));
        int length;
        byte[] bytes = new byte[1024];
        while((length=FIS.read(bytes))!=-1){
            os.write(bytes,0,length);
        }
        socket.shutdownOutput();

        InputStream IS = socket.getInputStream();
        length = IS.read(bytes);

        System.out.println(new String(bytes,0,length));
        FIS.close();
        socket.close();

    }
}
