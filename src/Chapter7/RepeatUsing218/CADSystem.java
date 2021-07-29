package Chapter7.RepeatUsing218;

public class CADSystem extends  Shape{

    private Circle с;
    private Triangle t;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++)
            lines[j] = new Line(j, j * j);
        с = new Circle(1);
        t = new Triangle(1);
        System.out.println("Комбинированный конструктор");
    }

    void dispose() {
        System.out.println("CADSystem.dispose");
        t.dispose();
        с.dispose();
        for (int i = lines.length - 1; i >= 0 ; i --)
        lines[i].dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
        } finally {
        x.dispose();}
    }
}