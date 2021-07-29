package Chapter9.Exercise287.Exer19;

public class CoinFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Coin();
    }
}
