package Chapter8.Features243;

import java.util.Random;

public class RandomShapeGenerator {
    Random rand = new Random(48);
    public Shape next(){
        switch (rand.nextInt(4)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rhombus();
        }
    }
}
