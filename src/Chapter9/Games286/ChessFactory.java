package Chapter9.Games286;

public class ChessFactory implements GameFactory {
    public Game getGame(){return new Chess();}
}
