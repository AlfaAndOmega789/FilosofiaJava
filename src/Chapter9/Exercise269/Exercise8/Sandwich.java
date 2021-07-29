package Chapter9.Exercise269.Exercise8;


public class Sandwich extends PortableLunch implements FastFood {

    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich(){
        System.out.println("Sandwich()");
    }

    @Override
    public void eat() {
        System.out.println("Я кушаю");
    }

    @Override
    public void drink() {
        System.out.println("Я пью");
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.eat();
        sandwich.drink();

    }
}
