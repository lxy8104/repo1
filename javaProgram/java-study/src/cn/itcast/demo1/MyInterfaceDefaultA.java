package cn.itcast.demo1;

public class MyInterfaceDefaultA implements MyInterfaceDefault {
    @Override
    public void method() {
        System.out.println("实现了接口的抽象方法AAA");
    }

    @Override
    public void method1(){
        System.out.println("覆盖了接口的方法");
    }
}
