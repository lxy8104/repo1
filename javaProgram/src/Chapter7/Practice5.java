package Chapter7;

class A1{
    A1(){
        System.out.println("constructor A");
    }
}

class B1{
    B1(){
        System.out.println("constructor B");
    }
}

class C1 extends A1{
    public B1 b = new B1();
    public static void main(String[] args){
        C1 c = new C1();
    }
}