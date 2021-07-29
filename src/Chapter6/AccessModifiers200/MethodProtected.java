package Chapter6.AccessModifiers200;

public class MethodProtected {
    protected void privet(){

    }

    public static void main(String[] args) {
        DifferentFields differentFields = new DifferentFields();

        differentFields.name = "Ivan";
        differentFields.name();

        differentFields.age = 7;
        differentFields.age();

//        differentFields.cash = 43.34d;





//        DifferentFields differentFields = new DifferentFields();
//        differentFields.method();

    }
}
