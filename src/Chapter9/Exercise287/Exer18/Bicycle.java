package Chapter9.Exercise287.Exer18;

public class Bicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Bicycle ride");
    }

    @Override
    public void rideFast() {
        System.out.println("Bicycle ride to fast");
    }
}
