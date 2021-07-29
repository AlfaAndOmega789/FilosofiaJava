package Chapter9.Games286;

public class Games {
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        while(s.move());
    }

    public static void main(String[] args) {

    }
}
