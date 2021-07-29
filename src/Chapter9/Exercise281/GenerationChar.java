package Chapter9.Exercise281;

import java.util.Random;

public class GenerationChar {
    private static Random rand = new Random(127);

    public int next(){return rand.nextInt();}

    public static void main(String[] args) {
        GenerationChar generate = new GenerationChar();
        for(int i = 0; i < 10; i++){
            System.out.println((char)generate.next());
        }
    }

}
