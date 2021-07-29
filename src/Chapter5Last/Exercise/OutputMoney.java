package Chapter5Last.Exercise;

public class OutputMoney {
    public static void main(String[] args) {
        for(Money money : Money.values())
            System.out.println(money + " , ordinal " + money.ordinal());
    }
}
