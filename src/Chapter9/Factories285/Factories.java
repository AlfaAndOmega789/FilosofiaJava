package Chapter9.Factories285;

public class Factories {
    public static void serviseConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviseConsumer(new ImplementationFactory1());
        serviseConsumer(new ImplementationFactory2());
    }
}
