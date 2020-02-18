/*Write a single program for following operation using overloading
        A) Adding 2 integer number
        B) Adding 2 double
        C) multiplying 2 float
        D) multiplying 2 int
        E) concate 2 string
        F) Concate 3 StringBuffer*/
package java1;

public class q10 {
    int sum(int a,int b){
        return a+b;
    }

    double sum(double a, double b){
        return a+b;
    }

    float multiply(float a, float b){
        return a*b;

    }

    int multiply(int a, int b){
        return a*b;

    }

    String concat(String a, String b){
        return a+b;
    }

    String concat(String a, String b, String c){
        return a+b+c;
    }


    public static void main(String[] args) {
        q10 q = new q10();
        System.out.println(q.sum(10,12));
        System.out.println(q.sum(4.1,2.1));
        System.out.println(q.multiply(1,2));
        System.out.println(q.multiply(3.2f,4.5f));
        System.out.println(q.concat("hello","world"));
        System.out.println(q.concat("hey","there","you!"));


    }
}
