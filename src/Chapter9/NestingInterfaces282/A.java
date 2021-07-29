package Chapter9.NestingInterfaces282;

public class A {

    interface B{
        void f();
    }

    public class B1 implements B{
        @Override
        public void f() {}
    }

    public class B2 implements B{
        @Override
        public void f() {}
    }

    interface C{
        void f();
    }

    public class C1 implements C{
        @Override
        public void f() {}
    }

    public class C2 implements C{
        @Override
        public void f() {}
    }

    interface D{
        void f();
    }

    public class D1 implements D{
        @Override
        public void f() {}
    }

    public class D2 implements D{
        @Override
        public void f() {}
    }

    public D getD(){return new D2();}

    private D dRef;

    public void reciveD(D d){
        dRef = d;
        dRef.f();
    }

    interface E{
        interface G{
            void f();
        }

        public interface H{
            void f();
        }

        void g();
    }

    public class NestingInterfaces{
        public class B1 implements A.B{
            @Override
            public void f() {}
        }

        public class C1 implements A.C{
            @Override
            public void f() {}
        }

        class E1 implements E{
            @Override
            public void g() {}
        }

        class E2 implements E{
            @Override
            public void g() {}
        }

        class EG1 implements E.G{
            @Override
            public void f() {}
        }

        class EG implements E.G{
            @Override
            public void f() {}
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        a2.reciveD(a.getD());
    }
}
