package cn.itcast.demo7.Thread;

public class ThreadMethod {
    public static void main(String[] args) {
        threadYield();

        System.out.println("main线程结束");

    }

    public static void threadYield() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" +i);
                    if(i==3){
                        Thread.yield();
                    }
                }
            }
        };

        Thread thread1 = new Thread(r, "Thread-1");
        Thread thread2 = new Thread(r, "Thread-2");

        thread1.start();
        thread2.start();


    }

    public static void threadPriority() {
        //设置线程的优先级，只是修改这个线程可以去抢CPU时间片的概率
        //并不是优先级高的线程一定能抢到CPU时间片
        //优先级的设置，是一个整数 [0 , 10]的整数，默认是5
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" +i);
                }
            }
        };

        Thread t1 = new Thread(r, "Thread-1");
        Thread t2 = new Thread(r, "Thread-2");

        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();

    }


    public static void threadNamed() {
        Thread t = new Thread();
        System.out.println(t.getName());


        //实例化一个线程对象
        Thread t1 = new Thread();
        t1.setName("custom");
        System.out.println(t1.getName());

        //2.实例化一个线程对象的同时，通过构造方法对线程进行命名
        //Thread(Runnable r, String name)
        Thread t2 = new Thread(()->{},"custom2");
        System.out.println(t2.getName());

        //3. 实例化自定义线程类，要重写其构造方法
        MyThread2 t3 = new MyThread2("custom3");
        System.out.println(t3.getName());
        t3.start();

        MyThread2 t4 = new MyThread2("custom3");
        System.out.println(t4.getName());
        t4.start();
    }
}


class MyThread2 extends Thread{
    public MyThread2(){}
    public MyThread2(String name){
//        super(name);
        this.setName(name);
    }
    @Override
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println(i);
            //线程休眠
            //1.参数:毫秒为单位的时间差
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}