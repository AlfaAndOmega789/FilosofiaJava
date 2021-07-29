package Chapter9.Exercise266;
//упражнение 4
public class ProizvAbstract extends AbstractWithoutMethod {

    @Override
    public void privet() {
        System.out.println("Hi!");
    }

    public static void recive(AbstractWithoutMethod abstr) {

    }

    public static void main(String[] args) {

        AbstractWithoutMethod abstr = new ProizvAbstract();
        ProizvAbstract proizv = (ProizvAbstract) abstr;
        recive(proizv);
        proizv.privet();


//        ProizvAbstract proizvAbstract = new ProizvAbstract();
//        recive(proizvAbstract);
//        proizvAbstract.print();


    }
}
