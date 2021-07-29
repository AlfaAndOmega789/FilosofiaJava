package Chapter8.EndAction253;

public class LivingCreature {
    private String privet;
    private Characteristic po = new Characteristic("живое существо");
    private Description to = new Description("обычное живое существо");
    LivingCreature(){
        System.out.println("LivingCreature()");
    }


    protected void dispose(){
        System.out.println("dispose в LeavingCreature ");
        to.dispose();
        po.dispose();
    }
}
