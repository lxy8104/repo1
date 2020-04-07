package cn.itcast.demo7.sourceconflict;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {

        //实例化一个对象
        ReentrantLock lock = new ReentrantLock();

        Runnable r = ()->{
            while(TicketCenter.restCount > 0){
                //对临界资源上锁
                lock.lock();

                if(TicketCenter.restCount<=0){
                    return;
                }

                System.out.println(Thread.currentThread().getName()+"卖出一张票，剩余"+ --TicketCenter.restCount+"张");

                //对临界资源解锁
                lock.unlock();
            }
        };

        Thread t5 = new Thread(r,"Thread-1");
        Thread t6 = new Thread(r,"Thread-2");


        t5.start();
        t6.start();
    }
}
