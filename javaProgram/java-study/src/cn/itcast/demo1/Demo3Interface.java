package cn.itcast.demo1;

public class Demo3Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        //错误写法  静态方法不能 通过实例化实现类对象来调用
        //impl.methodStatic;

        //直接通过接口调用
        MyInterfaceStatic.methodStatic();

    }
}
