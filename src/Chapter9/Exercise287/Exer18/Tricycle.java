package Chapter9.Exercise287.Exer18;

public class Tricycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Tricycle ride");
    }

    @Override
    public void rideFast() {
        System.out.println("Tricycle ride to fast");
    }
}
