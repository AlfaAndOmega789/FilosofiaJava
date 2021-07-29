package Chapter8.Rodent247_254_255andChap9_266;

public class Char {
    private String s;
    Char(){
        System.out.println("Char " + this);
    }
    Char(String s){
        this.s = s;
        System.out.println("Создаем Char " + s);
    }
    protected void dispose(){
        System.out.println("Завершаем Char " + s);
    }

}
