package Chapter8.Instrument238and247;

import java.util.Random;

public class RandomObjectGenerator {
    Random randomShapeGenerator = new Random();

    public Instrument next(){
        switch (randomShapeGenerator.nextInt(7)){
            default:
            case 1:
            case 2: return new Wind();
            case 3: return new Stringed();
            case 4: return new WoodWind();
            case 5: return new Percussion();
            case 6: return new Duda();
            case 7: return new Brass();
        }
    }
}
