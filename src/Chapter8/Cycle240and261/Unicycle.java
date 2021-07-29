package Chapter8.Cycle240and261;

public class Unicycle extends Cycle {
    @Override
    public void roll(){
        System.out.println("Unicycle.roll()");
        wheels(1);
    }

    @Override
    public String wheels() {
        return "Волшебное колесо";
    }

    @Override
    public void wheels(int a) { System.out.println("Волшебное колесо");}

    public void balance(){
        System.out.println("Метод balance класса Unicycle");
    }
}
