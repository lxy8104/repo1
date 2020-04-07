package demo2;

public interface demo1 {

    void show();

    public abstract void show1();

    //错误 在接口中的抽象方法必须是public abstract修饰  在抽象类中的抽象方法可以是protected和public修饰
    //protected abstract void show2();
}
