package cn.itcast.demo7.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Runnable r1 = ()->{
            System.out.println(Thread.currentThread().getName()+"创建了一个新线程");
        };

       // Thread t1 = new Thread(r1);

        es.submit(new Thread(r1));
        es.submit(new Thread(r1));


    }
}
