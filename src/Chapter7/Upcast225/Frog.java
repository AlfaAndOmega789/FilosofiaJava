package Chapter7.Upcast225;

public class Frog extends Amphibian{
    @Override
    public void jump() {
        System.out.println("Прыгаю");
    }

    @Override
    public void run() {
        System.out.println("Бегаю");
    }

    @Override
    public void eat() {
        System.out.println("Кушаю");
    }

    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.jump();
        amphibian.eat();
        amphibian.run();
    }
}
