//WAP to create singleton class.
package java2;


public class q4 {

    private static q4 mysingleton;

    static {
        mysingleton = new q4();

    }

    private q4(){

    }

    public static q4 getInstance(){
        return mysingleton;
    }

    public void testMe(){
        System.out.println("hello, print me!!!");
    }
    public static void main(String[] args) {
        q4 q = getInstance();
        q.testMe();

    }
}
