// Find common elements between two arrays.
package java1;

public class q5 {
    public static void main(String[] args) {
        int a1[] = {0,1,2,3,6,7,8};
        int a2[] = {1,6,7,9,2,8,9};
        for (int i = 0; i < a1.length ; i++) {
            for(int j = 0;j < a2.length;j++){
                if(a1[i]==a2[j]){
                    System.out.println(a1[i] + " ");
                }

            }

        }

    }
}
