package cn.itcast.demo2;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("连接键盘");
    }

    @Override
    public void close() {
        System.out.println("断开键盘");
    }

    public void type(){
        System.out.println("敲击键盘");
    }
}
