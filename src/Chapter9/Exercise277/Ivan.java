package Chapter9.Exercise277;

public class Ivan extends Human implements AllAction {
    public static void fly(AllAction f){
        f.fly();
    }
    public static void run(Run r){
        r.run();
    }
    public static void swim(Swim s){
        s.swim();
    }
    public static void jump(Jump j){
        j.jump();
    }

    @Override
    public void fly() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void highJump() {

    }

    @Override
    public void run() {

    }

    @Override
    public void fastRun() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void slowSwim() {

    }

    public static void main(String[] args) {
        Ivan ivan = new Ivan();
        fly(ivan);
        swim(ivan);
        run(ivan);
        fly(ivan);
    }
}
