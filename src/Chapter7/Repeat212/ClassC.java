package Chapter7.Repeat212;

public class ClassC extends ClassA {
    ClassB pole;
    ClassC(){
        super("Ivan");
        pole = new ClassB("Ivan");

        System.out.println("Constructor C");
    }

    public static void main(String[] args) {
        ClassC classC = new ClassC();
    }
}
