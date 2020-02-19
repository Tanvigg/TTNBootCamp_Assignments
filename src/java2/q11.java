//Convert the following code so that it uses nested while statements instead of for statements:
package java2;

public class q11 {
    public static void main(String[] args) {
        int s=0;
        int t=1;
        int i=0;
        int j;
        while(i<10){
            s=s+i;
            j=i;
            while(j>0)
            {
                t=t*(j-1);
                j--;
            }
            s=s*t;
            i++;
            System.out.println("T is: " + t);
        }
        System.out.println("S is: "+ s);
    }
}

