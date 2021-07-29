package Chapter8.Instrument238and247;

public class Duda extends Wind {

    @Override
    public void play(Note n) {
        System.out.println("Duda.play() " + n);
    }

    @Override
    public String what() {
        return "Duda";
    }



}
