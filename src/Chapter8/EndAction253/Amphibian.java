package Chapter8.EndAction253;

public class Amphibian extends Animal {

    private Characteristic po = new Characteristic("может жить в воде");
    private Description to = new Description("и в воде, и на земле");
    Amphibian(){
        System.out.println("Amphibian()");
    }
    protected void dispose(){
        System.out.println("dispose в Amphibian()");
        po.dispose();
        to.dispose();
        super.dispose();
    }
}
