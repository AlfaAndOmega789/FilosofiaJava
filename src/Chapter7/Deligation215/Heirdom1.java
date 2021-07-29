package Chapter7.Deligation215;

public class Heirdom1   {

//        @Override
//        public void scrub() {
//            append("Heirdom1.scrub()");
//
//        }
        public void sterilize(){
            System.out.println("Новый метод!");
        }

        public static void main(String[] args) {
            Heirdom1 x = new Heirdom1();
//            x.scrub();
            x.sterilize();
            Detergent1.main(args);
        }
    }

