package Chapter8.Cycle240and261;


public class Ride {
    public static void ride(Cycle i, String wheels){
        i.roll();
    }

    public static void main(String[] args) {
//        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};
//
//        Cycle[] cycle = new Cycle[3];
//        Unicycle unicycle = new Unicycle();
//        Bicycle bicycle = new Bicycle();
//        Tricycle tricycle = new Tricycle();
//        Cycle cycler = new Unicycle();
//        ((Unicycle) cycler).balance();
//
//        cycle[0] = unicycle;
//        cycle[1] = bicycle;
//        cycle[2] = tricycle;
        Cycle[] cs = {new Unicycle()};
        cs[0] = (Unicycle) new Cycle();// тут ошибка

        Cycle cycle = new Unicycle();
        Unicycle un = (Unicycle)cycle;// здесь все отлично
        un.balance();
//
//        cycle[0] = (Unicycle) new Cycle();
//        System.out.println(cycle[0]);



//        Unicycle un = (Unicycle)new Cycle();
//        un.balance();
//        Bicycle bu = (Bicycle)new Cycle();
//        bu.balance();
//        Tricycle tr = (Tricycle)new Cycle();


//        Bicycle velik = new Bicycle();
//        Unicycle unicycle = new Unicycle();
//        Tricycle tricycle = new Tricycle();
//        Cycle cycle = new Cycle();
//        ride(cycle, cycle.wheels());
//        ride(velik, velik.wheels());
//        ride(unicycle, unicycle.wheels());
//        ride(tricycle, tricycle.wheels());
    }
}
