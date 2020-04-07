package cn.itcast.demo7.sourceconflict;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Runnable r = ()->{
            while(TicketCenter.restCount > 0){
                //对象锁
                synchronized (""){
                    //类锁 synchronized(SynchronizedDemo.clss){
                    if (TicketCenter.restCount<=0){
                        return;
                    }
                    System.out.println(Thread.currentThread().getName()+"卖出一张票，剩余"+ --TicketCenter.restCount+"张");
                }

            }
        };

        Thread t5 = new Thread(r,"Thread-1");
        Thread t6 = new Thread(r,"Thread-2");
        Thread t7 = new Thread(r,"Thread-3");
        Thread t8 = new Thread(r,"Thread-4");
        Thread t9 = new Thread(r,"Thread-5");

        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        //为什么结果只出现了Thread-1 应该是因为cpu太好了，直接跑完，如果数量更大就会用到所有线程
    }
}
