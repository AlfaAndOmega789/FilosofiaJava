package Chapter8.Rodent247_254_255andChap9_266;

public class Hamster extends Rodent {
    @Override
    public void eat() {
        System.out.println("Hamster.eat()");
    }

    private Char po = new Char("хомяк");
    private Desc to = new Desc("хомяк домашний");
    Hamster(){
        System.out.println("Hamster()");
    }
    protected void dispose(){
        System.out.println("dispose в Hamster ");
        to.dispose();
        po.dispose();
//        super.dispose();
    }
}
