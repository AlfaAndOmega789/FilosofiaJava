package Chapter8.Instrument238and247;

public abstract class Instrument implements Playable{

    public abstract String what();
    public abstract void adjust();

    @Override
    public String toString() {
        return what();
    }


//    public abstract void play(Note n);
//    public abstract String what();
//    public abstract void adjust();
//
//    @Override
//    public String toString() {
//        return what();
//    }
/** Стр 270 упражнение 9*/


    //    public void play(Note n){
//        System.out.println("Instrument.play()");
//    }
//    public String what(){
//        return "Instrument";
//    }
//    public void adjust(){
//        System.out.println("Adjusting Instrument");
//    }
//
//    @Override
//    public String toString() {
//        return what();
//    }
    /**данные методы используются в упр на страницах 238 и 247*/

}
