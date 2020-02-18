// Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
package java1;

public class q7 {
    static {
        System.out.println("Tanvi");
        System.out.println("Gupta");
        System.out.println("23");
    }

    static String fname="Tanvi";
    static String lname="Gupta";
    static int age =23;


    public static void main(String[] args) {
        System.out.println(q7.fname);
        System.out.println(q7.lname);
        System.out.println(q7.age);
        myfun();


    }

    static void myfun(){
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(age);
    }
}
