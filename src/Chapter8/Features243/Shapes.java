package Chapter8.Features243;

public class Shapes {
    private static RandomShapeGenerator random = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[12];
        for (int i = 0; i < s.length; i++) {
            s[i] = random.next();
        }
        for (Shape shp : s) {
            shp.draw();
            shp.method();
            shp.erase();
        }
    }
}
