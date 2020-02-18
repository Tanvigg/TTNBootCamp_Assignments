// Write a program to find the number of occurrences of the duplicate words in a string and print them ?
package java1;

public class q2 {
    public static void main(String[] args) {
        String st = "Hello it is a rude world , hello this is a great world";
        String st1[]=st.split(" ");
        for(int i=0;i < st1.length;i++){
            int count=1;
            for(int j=i+1;j < st1.length;j++){
                if(st1[i].equals(st1[j])){
                    ++count;
                    System.out.println(st1[i] + " " + count);

                }
            }

        }

    }
}
