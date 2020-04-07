package cn.itcast.demo7.sourceconflict;

public class SynchronizedDemo2 {
    public static void main(String[] args) {
        Runnable r = ()->{
            while(TicketCenter.restCount > 0){
                //对象锁
                soldTicket();
                }
        };

        Thread t11 = new Thread(r,"Thread-1");
        Thread t22 = new Thread(r,"Thread-2");
        Thread t33 = new Thread(r,"Thread-3");
        Thread t44 = new Thread(r,"Thread-4");
        Thread t55 = new Thread(r,"Thread-5");
        Thread t66 = new Thread(r,"Thread-6");

        t11.start();
        t22.start();
        t33.start();
        t44.start();
        t55.start();
        t66.start();
    }

    public synchronized static void soldTicket(){

            if (TicketCenter.restCount<=0){
                return;
            }
            System.out.println(Thread.currentThread().getName()+"卖出一张票，剩余"+ --TicketCenter.restCount+"张");

    }
}
