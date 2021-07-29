package Chapter9.InterfaceAndRealization271;

import java.util.Arrays;

public class Downcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
