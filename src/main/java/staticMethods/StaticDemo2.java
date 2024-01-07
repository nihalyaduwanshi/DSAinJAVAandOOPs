package staticMethods;
class Emp{
    private int age;
    private String name;
    private static String company="Amazon";

    public Emp(int a,String n){
        age=a;
        name=n;
    }
    public void display(){
        System.out.println("age="+age+" name="+name+" company="+company);
    }
    public static void showCompany(){
        System.out.println("Company name is amazon...");
    }
}

public class StaticDemo2 {
    public static void main(String[] args) {
        Emp.showCompany();
        Emp e=new Emp(21,"Nihal");
        Emp f=new Emp(45,"ashish");
        Emp g=new Emp(32,"lodhi");
        e.display();
        f.display();
        g.display();
    }
}
