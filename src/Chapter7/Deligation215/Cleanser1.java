package Chapter7.Deligation215;

public class Cleanser1 {

        private String s = "Cleanser1";
        public void append(String а) { s += а; }
        public void dilute() { append(" dilute()"); }
        public void apply() { append(" apply()"); }
        public void scrub() { append(" scrub()"); }
        public void foam() { append(" foam()"); }
        public String toString() { return s; }
        public static void main(String[] args) {
            Cleanser1 x = new Cleanser1();
            x.dilute();
            x.apply();
            x.scrub();
            System.out.println(x);
        }

    }

