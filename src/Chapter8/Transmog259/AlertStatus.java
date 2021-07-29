package Chapter8.Transmog259;

public class AlertStatus extends Starship{
    AlertStatus(){
        super();
        System.out.println("Вызов конструктор AlertStatus");
    }
    public void privet(){
        System.out.println("AlertStatus вызов из метода privet");
    }

    @Override
    public String toString() {
        return "Вызов из AlertStatus";
    }
}
