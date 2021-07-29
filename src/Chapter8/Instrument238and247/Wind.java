package Chapter8.Instrument238and247;

public class Wind extends Instrument{
    @Override
    public void play(Note n){
        System.out.println("Wind.play() " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Wind");
    }
}
