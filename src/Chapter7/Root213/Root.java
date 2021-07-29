package Chapter7.Root213;

public class Root {

    Component1 component1;
    Component2 component2;
    Component3 component3;
    Root(String name, Component1 component1, Component2 component2, Component3 component3)
    {
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;
        System.out.println("Constructor Root");
    }
    void dispose(){
        System.out.println("Вызов из Root");
    }
}
