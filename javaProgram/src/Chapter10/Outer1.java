package Chapter10;

public class Outer1 {
    private String s;
    Outer1(String s1) {
        System.out.println("Outer Constructor");
        this.s = s1;
    }
    class Inner {
        Inner() { System.out.println("Inner()"); }
        public String toString(){return s;}
    }
    Outer1() { System.out.println("Outer1()"); }
    // make an Inner from within a non-static method of outer class:
    Inner makeInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        Outer1 o = new Outer1("lxy");
        Outer1.Inner i = o.new Inner();
        Outer1.Inner i1 = o.makeInner();
        Inner i2 = o.makeInner();
        System.out.println(i2.toString());
    }
}

class A{
    public static void main(String[] args) {
        Outer1 o1 = new Outer1("lxy2");
        Outer1.Inner i3 = o1.new Inner();
        Outer1.Inner i4 = o1.makeInner();

    }
}