package Chapter5Last.Exercise;

public class OutputMoney1 {
        Money money;
        public OutputMoney1(Money money){
            this.money = money;
        }
        public void describe(){
            System.out.println("This money is ");
            switch (money){
                case EURO:
                    System.out.println("i want a lot of European Euros");
                    break;
                case DOLLAR:
                    System.out.println("i want a lot of USA Dollars");
                    break;
                case RUS:
                    System.out.println("i want a lot of Russian Rubl");
                    break;
                case ZL:
                    System.out.println("i want a lot of Poland Zloty");
                    break;
                case BYN:
                    System.out.println("i want a lot of Belarus BYN");
                    break;
                case TENGI:
                    System.out.println("i want a lot of Kazakhstani Tengri");
                    break;
                    default:
                        System.out.println("all the money in the world");
            }
        }
}
