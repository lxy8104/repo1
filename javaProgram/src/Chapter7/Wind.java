package Chapter7;

import java.util.Random;

class Instrument{
    public void play(){}
    static void tune(Instrument i){
        i.play();
    }
}

public class Wind extends Instrument{
    public static void main(String[] args){
        Wind flute = new Wind();
        Instrument.tune(flute);//向上转型
    }
}


class Amphibian {
    protected void swim() {
        System.out.println("Amphibian swim");
    }
    protected void speak() {
        System.out.println("Amphibian speak");
    }
    void eat() {
        System.out.println("Amphibian eat");
    }
    static void grow(Amphibian a) {
        System.out.println("Amphibian grow");
        a.eat();
    }
}

class Frog17 extends Amphibian {
    @Override protected void swim() {
        System.out.println("Frog swim");
    }
    @Override protected void speak() {
        System.out.println("Frog speak");
    }
    @Override void eat() {
        System.out.println("Frog eat");
    }
    static void grow(Amphibian a) {
        System.out.println("Frog grow");
        a.eat();
    }
    public static void main(String[] args) {
        Random rand = new Random(30);
        final Boolean value = rand.nextBoolean();
        System.out.println(value);
        Frog17 f = new Frog17();
        // call overridden base-class methods:
        f.swim();
        f.speak();
        f.eat();
        // upcast Frog17 to Amphibian argument:
        f.grow(f);
        // upcast Frog17 to Amphibian and call Amphibian method:
        Amphibian.grow(f);
    }
}

