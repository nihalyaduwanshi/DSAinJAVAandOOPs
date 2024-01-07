public class Acoount {
    private int accId;
    private String name;
    private int balance;
    public Acoount(int a,String n,int b){
        accId=a;
        name=n;
        balance=b;
    }
    public void showAc(){
        System.out.println("AcId"+accId);
        System.out.println("Name"+name);
        System.out.println("bal"+balance);
    }
    }








