package Chapter8.ProTest248;

public class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}
