package Chapter6.TipoNewPackage204;

public class ConnectionManager {
    public static int i = 0;
    static Connection[] connections = new Connection[3];


    public static void main(String[] args) {
        for(int i = 0; i < connections.length + 1;i++){
            if(i < connections.length)
                connections[i] = Connection.makeConnection();
            else
                System.out.println("null");
        }
    }


}
