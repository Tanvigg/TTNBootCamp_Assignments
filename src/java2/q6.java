//WAP showing try, multi-catch and finally blocks.
package java2;

public class q6 {
    public static void main(String[] args) {
        try {
            int a[] = new int[7];
            a[7]= 30/0;

        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally
        {
            System.out.println("finally block executed");
        }
    }
}
