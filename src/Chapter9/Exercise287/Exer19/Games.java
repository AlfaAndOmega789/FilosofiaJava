package Chapter9.Exercise287.Exer19;

public class Games {
    public static void gameConsumer(GameFactory factory){
        Game game = factory.getGame();
        game.cast();
    }

    public static void main(String[] args) {
        gameConsumer(new CubeFactory());
        gameConsumer(new CoinFactory());
    }
}
