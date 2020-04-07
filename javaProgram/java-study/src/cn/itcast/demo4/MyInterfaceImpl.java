package cn.itcast.demo4;


public class MyInterfaceImpl {
    private String s = " ";
        MyInterface some = new MyInterface() {
            @Override
            public void play() {
                System.out.println("匿名内部类");
            }
        };
    }
