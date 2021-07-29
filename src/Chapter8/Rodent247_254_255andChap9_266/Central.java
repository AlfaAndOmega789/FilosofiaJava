package Chapter8.Rodent247_254_255andChap9_266;

public class Central {
    public static void main(String[] args) {
//        Rodent[] rod = {
//                new Rodent(),
//                new Hamster(),
//                new Mouse(),
//                new Capibara()
//        };
//        for(int i = 0; i < rod.length; i++){
//            rod[i].eat();
//        }
        System.out.println("Первый");
        Hamster hamster = new Hamster();
        hamster.dispose();
        System.out.println("Второй");
        Mouse mouse = new Mouse();
        mouse.dispose();
        System.out.println("Третий");
        Capibara capibara = new Capibara();
        capibara.dispose();
    }
}
