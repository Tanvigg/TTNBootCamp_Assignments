package java2;

import java.util.Scanner;

public class a8A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        while(!word.equals("done")){
            if(word.charAt(0)==word.charAt(word.length()-1)){
                System.out.println("first character == last character");
            }
            else{
                System.out.println("first character is not equal to last character");
            }
            word = sc.nextLine();
        }
    }
}
