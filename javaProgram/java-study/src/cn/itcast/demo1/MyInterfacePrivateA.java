package cn.itcast.demo1;

/*
问题描述：
我们需要抽取一个共有方法，来解决两个默认方法之间代码重复的问题
但是这个共有方法不应该让实现类使用，应该是私有化的
 */

public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1");
        commonMethodd();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
        commonMethodd();
    }

    default void commonMethodd(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
    default void common(){}
}
