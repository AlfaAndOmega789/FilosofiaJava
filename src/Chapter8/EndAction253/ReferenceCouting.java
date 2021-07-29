package Chapter8.EndAction253;

public class ReferenceCouting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared), new Composing(shared),
                                    new Composing(shared),new Composing(shared),new Composing(shared)};
        for(Composing s : composings){
            s.dispose();
        }
        System.gc();
    }
}
