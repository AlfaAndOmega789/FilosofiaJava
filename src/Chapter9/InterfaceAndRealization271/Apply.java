package Chapter9.InterfaceAndRealization271;

import Chapter9.Exercise274.Transfer;

public class Apply {
    public static void process (Processor p, Object s){
        System.out.println("Используем Processor " + p.name());
        System.out.println(p.process(s));
    }
    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Spliter(), s);
        process(new Transfer(), Transfer.transfer("пока"));


    }
}
