package Chapter9.Factories285;

public class ImplementationFactory1 implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation1();
    }
}
