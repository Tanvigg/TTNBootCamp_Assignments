//Write a program to replace a substring inside a string with other string ?
package java1;

public class q1 {
    public static void main(String[] args) {
        String st = "hello";
        String sub="world";
        System.out.println(st.replace(st.substring(0,3),sub));


    }


}
