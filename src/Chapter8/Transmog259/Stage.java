package Chapter8.Transmog259;

public class Stage {
    Stage(){
        System.out.println("Вызов конструктор Stage");
    }

    Starship starship = new AlertStatus();

    public void strategy(){
        starship = null;
    }
    public void galaxy(){
        starship = new AlertStatus();
        starship.privet();
    }

    @Override
    public String toString() {
        return "Вызов из Stage";
    }
}
