package java1;

public class q11 {
    int rateofInterest;
    String bankName;
    String bankAddress;

}

class BOI extends q11{
    public void setDetails(int roi, String name,String add){
        this.rateofInterest = roi;
        this.bankName = name;
        this.bankAddress = add;

    }

 public void getDetails(){
     System.out.println(this.rateofInterest);
     System.out.println(this.bankName);
     System.out.println(this.bankAddress);
     System.out.println("\n");
 }

}

class ICICI extends q11{
    public void setDetails(int roi, String name, String add){
        this.rateofInterest=roi;
        this.bankName = name;
        this.bankAddress=add;

    }
    public void getDetails(){
        System.out.println("Rate of Interest : "+this.rateofInterest );
        System.out.println("Bank Name : " + this.bankName);
        System.out.println("Bank Address : "+ this.bankAddress);
        System.out.println("\n");

    }


}

class SBI extends  q11{
    public void setDetails(int roi, String name, String add){
        this.rateofInterest=roi;
        this.bankName = name;
        this.bankAddress=add;

    }
    public void getDetails(){
        System.out.println("Rate of Interest : "+this.rateofInterest );
        System.out.println("Bank Name : " + this.bankName);
        System.out.println("Bank Address : "+ this.bankAddress);
        System.out.println("\n");

    }

    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.setDetails(7,"SBI","Noida");
        ICICI icici = new ICICI();
        icici.setDetails(8,"ICICI","Delhi");
        BOI boi = new BOI();
        boi.setDetails(9,"BOI","Greater NOida");
        sbi.getDetails();
        icici.getDetails();
        boi.getDetails();
    }

}

