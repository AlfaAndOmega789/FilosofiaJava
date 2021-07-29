package Chapter8.Rodent247_254_255andChap9_266;

public class Capibara extends Rodent {
    @Override
    public void eat() {
        System.out.println("Capibara.eat()");
    }

    private Char po = new Char("капибара");
    private Desc to = new Desc("капибара степная");
    Capibara(){
        System.out.println("Capibara()");
    }
    protected void dispose(){
        System.out.println("dispose в Capibara ");
        to.dispose();
        po.dispose();
//        super.dispose();
    }
}
