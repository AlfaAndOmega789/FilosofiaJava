package Chapter8.Constructor256;

public class Glyph {
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() перед вызовов draw");
        draw();
        System.out.println("Glyph() после вызовов draw");
    }

}
