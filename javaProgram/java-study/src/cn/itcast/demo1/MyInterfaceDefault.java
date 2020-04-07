package cn.itcast.demo1;

public interface MyInterfaceDefault {
    void method();

    public default void method1(){
        System.out.println("新添加的默认方法");
    }

}
