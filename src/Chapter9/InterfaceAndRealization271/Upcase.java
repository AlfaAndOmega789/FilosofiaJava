package Chapter9.InterfaceAndRealization271;

public class Upcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
