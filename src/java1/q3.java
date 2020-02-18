//Write a program to find the number of occurrences of a character in a string without using loop?

package java1;
public class q3 {
    public static void main(String[] args) {
        String st="tanvi gupta";
        String ch="a";
        System.out.println(st.length() - st.replace(ch,"").length());

    }


}
