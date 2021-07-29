package Chapter8.Cycle240and261;

public class Cycle {

    public void roll(){
        System.out.println("Cycle.roll()");
        wheels(0);
    }

    public String wheels(){
    return "Верните мои колеса";
    }

    public void wheels(int a){
        System.out.println("Верните мои колеса");
    }
}
