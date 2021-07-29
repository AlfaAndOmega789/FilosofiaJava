package Chapter9.InterfaceAndRealization271;

public class Spliter extends StringProcessor {
//    @Override
//    Object process(Object input) {
//        return ((String)input).toUpperCase();
//    }

    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
