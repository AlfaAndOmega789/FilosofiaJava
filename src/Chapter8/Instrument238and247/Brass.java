package Chapter8.Instrument238and247;

public class Brass extends Wind{

    public String play(Note n, int age){
        return "Brass.play() " + n;
    }

    @Override
    public String what() {
        return "Brass";
    }
}
