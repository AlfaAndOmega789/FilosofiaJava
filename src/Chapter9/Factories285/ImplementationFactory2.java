package Chapter9.Factories285;

public class ImplementationFactory2 implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation2();
    }
}
