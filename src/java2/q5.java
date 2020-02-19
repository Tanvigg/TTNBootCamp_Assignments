//WAP to show object cloning in java using cloneable and copy constructor both.
package java2;

public class q5 implements Cloneable{
    int rollno;
    String name;


  q5(int rollno, String name){
      this.rollno = rollno;
      this.name = name;

  }

  public Object clone() throws CloneNotSupportedException{
      return super.clone();
  }

    public static void main(String[] args) {
        try{
            q5 q = new q5(101,"amit");
            q5 q1 = (q5)q.clone();

            System.out.println(q.name);
            System.out.println(q1.name);


        }catch (CloneNotSupportedException c){

        }
    }

}
