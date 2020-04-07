package cn.itcast.demo7.sourceconflict;

//死锁情况

public class DeadLock {
    public static void main(String[] args) {
        Runnable r1 = ()->{
            synchronized ("A"){
                System.out.println("A线程持有A锁，等待B锁");
                synchronized ("B"){
                    System.out.println("A线程同时持有A和B锁");
                }
            }
        };


        Runnable r2 = ()->{
          synchronized ("B"){
              System.out.println("B线程持有B锁，等待A锁");
              synchronized("A"){
                  System.out.println("B线程同时持有A和B锁");
              }
          }
        };

        Thread t1 = new Thread(r1, "A");
        Thread t2 = new Thread(r2, "B");

        t1.start();
        t2.start();



    }
}
