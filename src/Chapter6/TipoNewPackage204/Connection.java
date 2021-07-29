package Chapter6.TipoNewPackage204;

public class Connection {
    public static int i = 0;
    private Connection(){
        System.out.println("Вызов " + (++i));

    }

    public static Connection makeConnection() {
        return new Connection();
    }
}
