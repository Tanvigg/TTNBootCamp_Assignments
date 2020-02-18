//Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
package java1;

public class q8 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Tanvi Gupta");
        //reverse
        s = s.reverse();
        System.out.println(s);
        s.replace(4,10,"");
        System.out.println(s);

    }
}
