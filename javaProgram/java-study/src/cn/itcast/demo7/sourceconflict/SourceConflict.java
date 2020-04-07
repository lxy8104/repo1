package cn.itcast.demo7.sourceconflict;

public class SourceConflict {
    public static void main(String[] args) {
        Runnable r = ()->{
            while(TicketCenter.restCount>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"卖出一张票，剩余"+ --TicketCenter.restCount+"张");
            }
        };

        Thread t1 = new Thread(r,"Thread-1");
        Thread t2 = new Thread(r,"Thread-2");
        Thread t3 = new Thread(r,"Thread-3");
        Thread t4 = new Thread(r,"Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}


