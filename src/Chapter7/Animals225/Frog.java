package Chapter7.Animals225;

public class Frog extends Amphibian {
    @Override
    void polzat() {
        System.out.println("Pereopredelen");
    }

    @Override
    void ohota() {
        System.out.println("Pereopredelen");
    }

    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.ohota();
        frog.polzat();
    }
}
