package Chapter8;

import java.util.ArrayList;

public class Test {
//    public static String remove(String str) {
//        char[] privet = str.toCharArray();
//        ArrayList<Character> poka = new ArrayList<Character>();
//        for (int i = 1; i < privet.length; i++) {
//            poka.add(privet[i]);
//        }
//        poka.remove(0);
//        poka.remove(poka.size() - 1);
//        String word = new String();
//        for (Character c : poka) {
//            word += c;
//        }
//        return word;
//    }

    public static String repeatStr(final int repeat, final String string) {
        String sex = "";
        System.out.print(sex);
        for(int i = 0; i < repeat;i++)
            sex += string;
        return sex;
    }

    public static void main(String[] args) {
//        System.out.println(remove("апривета"));
        System.out.println(repeatStr(4,"s"));
    }
}
