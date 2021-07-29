package Chapter8.Covariantnost258;

public class WheatMill extends Mill {
    Wheat process(){
        return new Wheat();
    }
}
