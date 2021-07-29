package Chapter7;

public class ProstoiClassDva209 {
    static ProstoiClass209 prostoiClass209;

    public static ProstoiClass209 method(){
        if(prostoiClass209 == null) {
            prostoiClass209 = new ProstoiClass209(15);
            System.out.println("Privet");
        }
        return prostoiClass209;
    }


    public static void main(String[] args) {
        System.out.println(method());// в if инициализируется переменная объявленная до метода method()

        prostoiClass209 = new ProstoiClass209(16);//переменная инициализируется другим значением

        System.out.println(method());//метод method(), игнорирует if и просто возвращает объект,
                                    // а после данный обЪект приводиться с помощью toString к типу String
                                    // и выводится на экран



    }

}
