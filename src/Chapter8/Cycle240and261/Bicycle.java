package Chapter8.Cycle240and261;

public class Bicycle extends Cycle{
    @Override
    public void roll(){
        System.out.println("Bicycle.roll()");
        wheels(2);
    }

    @Override
    public String wheels() {
        return "Два волшебных колеса";
    }


    @Override
    public void wheels(int a) {
        System.out.println("Два волшебных колеса");
    }

    public void balance(){
        System.out.println("Метод balance класса Bicycle");
    }

}
