// WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
package java2;

public class q3  {
    public static void  main(String[] args) {
        try{
            Class.forName("Class1");

        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }


    }




}


