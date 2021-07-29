package Chapter8.Features243;

public class Rhombus extends Shape {
    @Override
    public void draw() {
        System.out.println("Rhombus.draw()");
    }
//
//    @Override
//    public void erase() {
//        System.out.println("Rhombus.erase()");
//    }

    @Override
    public void erase() {
        System.out.println("Rhombus.erase()");

    }

    @Override
    public void method() {
        System.out.println("Метод из класса Rhombus");
    }

}
