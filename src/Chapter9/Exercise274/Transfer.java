package Chapter9.Exercise274;


import Chapter9.InterfaceAndRealization271.StringProcessor;
import java.util.ArrayList;

public class Transfer extends StringProcessor {

    public static String transfer(String s) {
        char[] ch = s.toCharArray();
        char cha = ch[0];

        for (int i = 0; i < ch.length; i += 2) {
            cha = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = cha;
        }
        return String.valueOf(ch);
    }

    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
