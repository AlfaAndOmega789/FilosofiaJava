package Chapter8.Rodent247_254_255andChap9_266;

public class Mouse extends Rodent{
    @Override
    public void eat() {
        System.out.println("Mouse.eat()");
    }

    private Char po = new Char("мышь");
    private Desc to = new Desc("мышь полевая");
    Mouse(){
        System.out.println("Mouse()");
    }
    protected void dispose(){
        System.out.println("dispose в Mouse ");
        to.dispose();
        po.dispose();
//        super.dispose();
    }
}
