package StaticBlock;

public class Account {
    private int accId;
    private String name;
    private double balance;
    private static double rateOfinterest;

    static{
        System.out.println("Enter rate of interest=");

    }
}
