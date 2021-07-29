package Chapter8.Instrument238and247;

public class Stringed extends Instrument{
    @Override
    public void play(Note n){
        System.out.println("Wind.play() " + n);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Stringed");
    }

}
