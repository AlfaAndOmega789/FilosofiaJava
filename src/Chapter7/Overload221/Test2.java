package Chapter7.Overload221;

public class Test2 extends Test1{
    void privet(int a){

    }

    public static void main(String[] args) {
        Test2 test1 = new Test2();
        Test2 test2 = new Test2();
        test1.privet(1);
        test1.privet("Ivan", "Ivan");
        test1.privet("Ivan", "Ivan", "Ivan");
        test1.privet("Ivan");
        test1.privet(test2);
    }
}
