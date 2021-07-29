package Chapter8.Instrument238and247;

public class Music {
    private static RandomObjectGenerator tre = new RandomObjectGenerator();

    public static void tune(Playable i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for(Instrument str : e)
            tune(str);

    }

    public static void main(String[] args) {
        Instrument[] str = new Instrument[7];
        for(int i = 0; i < str.length; i++)
        {
            str[i] = tre.next();
        }
        tuneAll(str);

//        Instrument ins = new Duda();
//        ins.play(Note.MIDDLE_C);
//        System.out.println(ins.toString());
//        Brass instrument = new Brass();
//        System.out.println(instrument.toString());
    }
}
