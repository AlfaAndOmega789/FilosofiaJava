package Chapter7.Game213;

public class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Конструктор Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
