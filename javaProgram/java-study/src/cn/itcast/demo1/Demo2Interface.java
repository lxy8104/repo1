package cn.itcast.demo1;

public class Demo2Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA aa = new MyInterfaceDefaultA();
        aa.method();
        aa.method1();
        MyInterfaceDefaultB bb = new MyInterfaceDefaultB();
        bb.method();
        bb.method1();
    }
}
