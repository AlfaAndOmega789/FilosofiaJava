package Chapter8.EndAction253;

public class Description {
    private String s;
    Description(String s){
        this.s = s;
        System.out.println("Создаем Description " + s);
    }
    protected void dispose(){
        System.out.println("Завершаем Description " + s);
    }
}
