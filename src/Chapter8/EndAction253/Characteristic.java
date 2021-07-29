package Chapter8.EndAction253;

public class Characteristic {
    private String s;
    Characteristic(String s){
        this.s = s;
        System.out.println("Создаем Characteristic " + s);
    }
    protected void dispose(){
        System.out.println("Завершаем Characteristic " + s);
    }
}
