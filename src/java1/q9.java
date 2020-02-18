// Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
package java1;

enum Level{
    BEGINNER(0),AMATURE(1),NORMAL(2),PROFESSIONAL(3);
    private int lvl;
    Level(int x){
        lvl =x;

    }
    int getPrice(){
        return lvl;
    }
}

public class q9 {
    public static void main(String[] args) {
        System.out.println("DEFAULT value of beginner is "+ Level.BEGINNER.getPrice());
        System.out.println("DEFAULT value of amature is "+ Level.AMATURE.getPrice());
        System.out.println("DEFAULT value of normal is "+ Level.NORMAL.getPrice());
        System.out.println("DEFAULT value of professional is "+ Level.PROFESSIONAL.getPrice());


    }


}
