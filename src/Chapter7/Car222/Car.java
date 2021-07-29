package Chapter7.Car222;


public class Car {

    public Wheel[] wheel = new Wheel[4];
    public Door
            left = new Door(),
            right = new Door(); // двухдверная машина

    public Car() {
        for (int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72) ;
        Engine engine = new Engine();
        engine.service();
    }
}
