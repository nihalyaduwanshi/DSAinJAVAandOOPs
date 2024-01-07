package Constructor;

public class Account {
    private int accid;
    private String name;
    private double balance;

    public Account(int id,String n,double b){
        System.out.println("Constructor call....");
        accid=id;
        balance=b;
        name=n;
    }
    public void showAccount(){
        System.out.println("Id="+accid);
        System.out.println("Name="+name);
        System.out.println("Bal="+balance);
    }
}
