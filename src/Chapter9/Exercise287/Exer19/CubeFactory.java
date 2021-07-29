package Chapter9.Exercise287.Exer19;

public class CubeFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Cube();
    }
}
