package Chapter8.Cycle240and261;

public class Tricycle extends Cycle{
    @Override
    public void roll(){
        System.out.println("Tricycle.roll()");
        wheels(3);
    }

    @Override
    public String wheels() {
        return "Три волшебных колеса";
    }

    @Override
    public void wheels(int a) {
        System.out.println("Три волшебных колеса");
    }
}
