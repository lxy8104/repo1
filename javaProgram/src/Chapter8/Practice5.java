package Chapter8;
import java.util.*;

class Circle extends Shape {
	@Override public void draw() { System.out.println("Circle.draw()"); }
	@Override public void erase() { System.out.println("Circle.erase()"); }

 }

 class RandomShapeGenerator {
	private Random rand = new Random();
	public Shape next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}
 }

 class Shape {
	public void draw() {}
	public void erase() {}
	public void play(){ System.out.println("message");}
 }

 class Square extends Shape {
	@Override public void draw() { System.out.println("Square.draw()"); }
	@Override public void erase() { System.out.println("Square.erase()"); }
	@Override public void play(){ System.out.println("override message");}
}

class Triangle extends Shape {
	@Override public void draw() { System.out.println("Triangle.draw()"); }
	@Override public void erase() { System.out.println("Triangle.erase()"); }
	@Override public void play(){ System.out.println("override message");}
 }


class Shapes {

    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[10];
        // fill up the array wth shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // make polymorphic method calls:
        for(Shape shp : s) {
			shp.draw();
			shp.play();
		}
    }
}