package Chapter7.Root213;

public class Component3 extends Component2{
    Component3(String name)
    {

        super(name);
        System.out.println("Constructor Component3");
    }

    void dispose(){
        System.out.println("Завершение Component3");
        super.dispose();
    }
}
