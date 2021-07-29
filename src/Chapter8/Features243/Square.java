package Chapter8.Features243;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void method() {
        System.out.println("Метод из класса Square");
    }
}
