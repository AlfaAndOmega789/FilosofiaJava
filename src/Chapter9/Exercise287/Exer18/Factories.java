package Chapter9.Exercise287.Exer18;

public class Factories {
    public static void cycleConsumer(CycleFactory factory){
        Cycle cycle = factory.getCycle();
        cycle.ride();
        cycle.rideFast();
    }

    public static void main(String[] args) {
        cycleConsumer(new BicycleFactory());
        cycleConsumer(new TricycleFactory());
        cycleConsumer(new UnicycleFactory());
    }
}
