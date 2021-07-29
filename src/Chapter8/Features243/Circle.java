package Chapter8.Features243;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void method() {
        System.out.println("Метод из класса Circle");
    }
}
