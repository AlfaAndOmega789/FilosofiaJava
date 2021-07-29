package Chapter10.Exercise295.Ex7;

public class NewClass {
    private String pole = "Ваня";
    private void method1(){}
    public void method2(){
        NewClass newClass = new NewClass();
        OldClass oldClass = newClass.new OldClass();
        oldClass.methodChange();
    }

    public class OldClass{
        public void methodChange(){
            pole = "Katya";
            method1();
        }
    }

}
