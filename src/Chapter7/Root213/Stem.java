package Chapter7.Root213;

public class Stem extends Root {


    Stem(String name, Component1 component1, Component2 component2, Component3 component3)
    {
        super(name,component1,component2, component3 );
        System.out.println("Constructor Stem");
    }

    @Override
    void dispose() {
        System.out.println("Вызов из Stem");
        super.dispose();
    }
    static Component1 component1 = new Component1("Ivan1");
    static Component2 component2 = new Component2("Ivan2");;
    static Component3 component3 = new Component3("Ivan3");

    public static void main(String[] args) {
        Stem stem = new Stem("Ivan",  component1,   component2,  component3);
        component1.dispose();
        component2.dispose();
        component3.dispose();
    }
}
