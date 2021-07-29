package Chapter8.EndAction253;

public class Frog extends Amphibian{

    private Characteristic po = new Characteristic("квакает");
    private Description to = new Description("ест жуков");

    Frog(){
        System.out.println("Frog()");
    }


//    boolean checkout = false;
//    Frog(boolean checkout){this.checkout = checkout;}
//
//    void CheckIn(){
//        checkout = false;
//    }
//    public void finalize(){
//        if(checkout)
//            System.out.println("Ошибка CheckedOut");
//    }


    protected void dispose(){
        System.out.println("dispose в Frog()");
        po.dispose();
        to.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Пока!");
        frog.dispose();

    }
}
