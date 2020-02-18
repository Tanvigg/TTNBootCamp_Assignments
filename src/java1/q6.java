//There is an array with every element repeated twice except one. Find that element
package java1;
import java. util. Arrays;

public class q6 {
    public static void main(String[] args) {
        int st[]={2,3,4,6,6,3,2,4,5};
        Arrays.sort(st);
        for(int i=0;i< st.length ;i=i+2) {
            if (st[i] == st[i + 1]){
                continue;
            }
            else {
                System.out.println(st[i]);
                break;
            }
        }

    }
}
