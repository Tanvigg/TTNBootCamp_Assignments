// WAP to convert seconds into days, hours, minutes and seconds.
package java2;
import java.io.*;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        int seconds;

        System.out.println("Enter Time in seconds:");
        Scanner sc = new Scanner(System.in);
        seconds = sc.nextInt();
        convertSectoDays(seconds);


    }

    private static void convertSectoDays(int seconds) {
        int days = seconds / (24 * 3600);
        seconds = seconds % (24 * 3600);
        int hours = seconds / 3600;
        seconds = seconds % 3600;
        int minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println(days + " " + "day " + hours + " " + "hours " + minutes + " " + "minutes " + seconds + " " + "seconds ");


    }
}