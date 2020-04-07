package cn.itcast.demo7.Thread;

public class ThreadCreate {
    public static void main(String[] args) {
        myThread my = new myThread();
        my.start();

        Runnable r1 = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("线程2中的逻辑"+i);
            }
        };

        Thread t2 = new Thread(r1);
        t2.start();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("线程3中的逻辑->"+i);
                }
            }
        };
        Thread t3 = new Thread(r2);
        t3.start();
        System.out.println("主线程中的逻辑执行结束了");
    }
}

class myThread extends Thread{
    @Override
    public void run() {
        for(int i =0;i<20;i++){
            System.out.println("子线程逻辑:"+i);
        }
    }
}