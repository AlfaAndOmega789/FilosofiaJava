package Chapter8.EndAction253;

public class Shared {
    private int number;
    private static int count;

    public Shared(){
        number = ++count;
    }

    @Override
    public String toString() {
        return "Shared " + number;
    }

    //    private int refcount = 0;
//    private static long counter = 0;
//    private static long count;
//
//    public Shared(){
//        System.out.println("Creature " + this);
//
//    }
//    public void addRef(){
//        refcount++;
//    }
//    protected void dispose(){
//        if(--refcount == 0)
//            System.out.println("Disposing " + this);
//    }
//    public String toString(){
//        return "Shared " + count;
//    }
//
}
