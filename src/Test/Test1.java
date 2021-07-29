package Test;

import javax.lang.model.element.NestingKind;
import java.util.Date;
import java.util.Random;

public class Test1 {
    String name;
    String age;
   public static void main(String[] args) {
//        Test1 test = new Test1();
//        System.out.println("Hi, today:");
//        System.out.println(new Date());
//        System.getProperties().list(System.out);
//        System.out.println(System.getProperty("user.name"));
//        System.out.println(System.getProperty("java.library.path"));
////
//        Integer int1 = new Integer(47);
//
//        Integer int2 = new Integer(47);
//        System.out.println(int1.equals(int2));

//
//       Test1 test1 = new Test1();
//       Test1 test11 = new Test1();
//       test1.name = "spoot";
//       test11.name = "scruffy";
//       System.out.println(test1.name + " " + test11.name);
//
//       test1 = test11;
//       test11.name = new String("spoot");
//       System.out.println(test1 == test11);
//       System.out.println(test1.equals(test11));

       Random rand = new Random();
       int i = rand.nextInt(100);
       int j = rand.nextInt(100);
       System.out.println(i);
       System.out.println(j);
       if(i > j)
           System.out.println("Reshka");
       if(j > i)
           System.out.println("Orel");
       if(i == j)
           System.out.println("Rebro");
    }
}
