package Chapter7.Root213;

public class Component2 extends Component1 {
    Component2(String name)
    {
        super(name);
        System.out.println("Constructor Component2");
    }

    void dispose(){
        System.out.println("Завершение Component2");
        super.dispose();
    }
}
