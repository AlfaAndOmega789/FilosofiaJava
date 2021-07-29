package CodeWars.Kata7;

import java.util.ArrayList;
/** найти максимально и минимальное значение в строке которая вам дана */
public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] stok = numbers.split(" ");
        ArrayList<Integer> privet = new ArrayList<>();
        for (String s : stok) {
            privet.add(Integer.parseInt(s));
        }
        int min = privet.get(0), max = privet.get(0);

        for (int i = 0; i < privet.size(); i++) {
            if (max <= privet.get(i))
                max = privet.get(i);
            if (min >= privet.get(i))
                min = privet.get(i);
        }
        return max + " " + min;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 2 -3 4 5"));
        System.out.println(highAndLow("1 9 3 4 -5"));
    }
}