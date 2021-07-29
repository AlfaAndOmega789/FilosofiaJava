package Chapter8.EndAction253;

public class Animal extends LivingCreature {
    private Characteristic po = new Characteristic("имеет сердце");
    private Description to = new Description("животное, не растение");
    Animal(){
        super();
        System.out.println("Animal()");

    }
    protected void dispose(){
        System.out.println("dispose в Animal()");
        po.dispose();
        to.dispose();
        super.dispose();
    }
}
