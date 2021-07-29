package Chapter7.Inheritance210;

public class Heirdom extends Detergent {
    @Override
    public void scrub() {
        append("Heirdom.scrub()");

    }
    public void sterilize(){
        System.out.println("Новый метод!");
    }

    public static void main(String[] args) {
        Heirdom x = new Heirdom();
        x.scrub();
        x.sterilize();
        Detergent.main(args);
    }
}
