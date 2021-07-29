package Chapter8.Rodent247_254_255andChap9_266;

public class Desc {
    private String s;
    Desc(String s){
        this.s = s;
        System.out.println("Создаем Desc " + s);
    }
    protected void dispose(){
        System.out.println("Завершаем Desc " + s);
    }
}
