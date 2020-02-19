package java2;

public class q9_metalChair extends q9_chair {
    @Override
    public void stressTest() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("passes the stress test");
    }
    public String chairType(){
        return "metal chair";
    }
    public void fireTest() {
        System.out.println("pases the fire test");
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
