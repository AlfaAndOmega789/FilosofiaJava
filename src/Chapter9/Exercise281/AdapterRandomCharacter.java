package Chapter9.Exercise281;

import sun.audio.AudioDataStream;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdapterRandomCharacter extends GenerationChar implements Readable {
    private int count;
    public AdapterRandomCharacter(int count){
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0)
        return -1;
//        String result = Integer.toString((char)next()) + " ";
        cb.append((char)next());
        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdapterRandomCharacter(10));
        while (s.hasNextInt()){
            System.out.println(s.nextInt());
        }
    }
}
