package java2;

import java.util.Scanner;

public class q8B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word");
        String word = sc.next();
        do{
            if(word.charAt(0) == word.charAt(word.length()-1)){
                System.out.println("First character is equal to last character");
            }
            else if(word.equals("done")){
                break;
            }
            else {
                System.out.println("first not equal to last");
            }
        }while (!word.equals("done"));

    }
}
