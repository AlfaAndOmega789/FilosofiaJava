package Chapter10.Exercise290;

import Chapter5Last.Exercise.OutputMoney;

public class Outer {
    private String stroks;

    public Outer(String stroks){
        this.stroks = stroks;
    }

    class Inner{
         @Override
         public String toString() {
             return Outer.this.stroks;
         }
     }

//    public static Inner vozvrat(){return new Inner();}

    public static void main(String[] args) {
//        Inner inner = vozvrat();
        Outer outer = new Outer("Ivan");
        Inner inner = outer.new Inner();
        System.out.println(inner);
    }
}
