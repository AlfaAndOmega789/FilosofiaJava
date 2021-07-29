package Chapter8.Instrument238and247;

public class WoodWind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("WoddWide.play() " + n);
    }

    @Override
    public String what() {
        return "WoodWide";
    }
}
