package Chapter10.VnutrClassAndVoshodPreobr;

public class Parcel4 {

    public class PContents implements Contents{
        private int i = 10;
        @Override
        public int value() {
            return i;
        }
    }

    public class PDestination implements Destination{
        private String label;
        public PDestination(String whereTo){
            label = whereTo;
        }
        @Override
        public String readLabel() {
            return label;
        }
        public Destination destination(String s){
            return new PDestination(s);
        }
        public Contents contents(){
            return new PContents();
        }
    }
}
