package Chapter8.Rodent247_254_255andChap9_266;

public abstract class Rodent {
    public void eat(){
        System.out.println("Rodent.eat()");
    }
    public void run(){}

    private Char po = new Char("грызун");
    private Desc to = new Desc("обычное живое существо");
    Rodent(){
        System.out.println("Rodent()");
    }
    protected abstract void dispose();
}
