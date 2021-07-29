package Chapter10.Exercise293;

public class OtdelnClass {
    public static void main(String[] args) {
        ClassSVnutr svnutr = new ClassSVnutr();
        ClassSVnutr.Vnutr vnutr = svnutr.new Vnutr();
        //упр 5 стр 293
        //можем создать экземляр внутреннего класса
        //только в том случае, если у нас есть экземляр внешнего класса(обращаясь через него к внутр)
    }
}
