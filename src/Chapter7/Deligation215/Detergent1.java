package Chapter7.Deligation215;

import Chapter7.Inheritance210.Cleanser;
import Chapter7.Inheritance210.Detergent;

public class Detergent1{
        private String name;

        public Detergent1(String name){
            this.name = name;
        }

        Cleanser1 x = new Cleanser1();

        public void scrub(){
            x.scrub();
        }
        public void dilute(){
            x.dilute();
        }
        public void apply(){
            x.apply();
        }

        public void foam(){
            x.foam();
        }

//        public void scrub() {
//            append("Detergent1.scrub()");
//            super.scrub();
//        }
//        public void foam() { append("foam()"); }


        public static void main(String[] args) {

            Detergent1 deter = new Detergent1("Ivan");
            deter.foam();
//            System.out.println(x);
//            System.out.println("Проверяем базовый класс");
//            Cleanser1.main(args);
        }
}

