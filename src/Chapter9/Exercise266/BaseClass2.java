package Chapter9.Exercise266;
//задание 3
// стр 269, упражнение 5, реализовать интерфейс из пакета Interface269
public class BaseClass2 extends BaseClass {
    private static int a = 5;
    @Override
    void print() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        BaseClass2 base = new BaseClass2();
        base.print();
    }
}
