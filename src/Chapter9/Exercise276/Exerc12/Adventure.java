package Chapter9.Exercise276.Exerc12;

public class Adventure {
    public static void t(CanFight t){t.fight();}
    public static void u(CanSwim u){u.swim();}
    public static void v(CanFly v){v.fly();}
    public static void l(CanClimb l){l.climb();}
    public static void w(ActionCharacter w){w.fight();}

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        l(h);
        w(h);
    }

}
