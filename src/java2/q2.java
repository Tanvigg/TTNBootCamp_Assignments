//WAP to sorting string without using string Methods?.
package java2;

public class q2 {
    public static void main(String[] args) {
        String st = "tanvi";
        System.out.println("Before Sorting :" + st);
        char st1[] = st.toCharArray();
        char temp=0;
        for(int i=0;i < st1.length;i++){
            for(int j=0;j<st1.length;j++){
                if(st1[j] > st1[i]){
                   temp = st1[i];
                   st1[i]=st1[j];
                   st1[j]=temp;
                }
            }
        }
        System.out.print("After sorting :");

        for(int k=0;k<st1.length;k++){
            System.out.print(st1[k]);
        }



    }
}
