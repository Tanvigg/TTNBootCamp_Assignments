//Create a custom exception that do not have any stack trace.
package java2;

class except extends Exception{
    String s1;

    except(String s2){
        s1=s2;
    }


    public String toString() {
        return ("My Exception Occured" + s1);

    }
}

public class q13 {
    public static void main(String[] args) {
        try{
            System.out.println("In Try Block");
            throw new except("Good error is present");
        }catch(except e){
            System.out.println("In catch block");
            System.out.println(e);
        }
    }



}

