package Chapter8;

class Meal {
    Meal() { System.out.println("Meal()"); }
}

class Bread {
    Bread() {  System.out.println("Bread()"); }
}

class Cheese {
    Cheese() {  System.out.println("Cheese()"); }
}

class Lettuce {
    Lettuce() {  System.out.println("Lettuce()"); }
}

class Pickle {
    Pickle() {  System.out.println("Pickle()"); }
}

class Lunch extends Meal {
    Lunch() {  System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() {  System.out.println("PortableLunch()"); }
}


class Sandwich11 extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Pickle p = new Pickle();
    private Lunch l = new Lunch();//前面调用Lunch的构造函数，
    private Lunch l1 = new Lunch();
    public Sandwich11() {  System.out.println("Sandwich()"); }
    public static void main(String[] args) {
        new Sandwich11();
    }
}