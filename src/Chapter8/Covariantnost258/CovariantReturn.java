package Chapter8.Covariantnost258;

public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
//        Grain g = new Grain();
        m = new WheatMill();
        g = m.process();
        System.out.println(g);  //upcasting; Переменная класса Mill ссылается на объект класса WheatMill
                                //и согласно коду выше вызывает метод process класса WheatMill,
                                // который возвращает объект класса Wheat

//      Grain g = new Wheat();  //upcasting возможен так как класс Wheat наследуется от
    }
}
