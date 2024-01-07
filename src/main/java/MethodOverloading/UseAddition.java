package MethodOverloading;

public class UseAddition {
    public static void main(String[] args) {
        Addition obj=new Addition();
        System.out.println("Sum of 10 and 20=  "+obj.add(10,20));
        System.out.println("Sum of 10.5 and 30.4= "+obj.add(10.5,30.4));
        System.out.println("Sum of Nihal and yaduwanshi= "+obj.add("Nihal","yaduwanshi"));
    }
}
