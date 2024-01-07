package Encapsulation;

public class Student {
    private int rollNo;
    private String name;
    private int per;

   public void setStudent(int r,String n,int p){
       rollNo=r;
       name=n;
       per=p;

   }
   public void showStudent(){
       System.out.println("Roll no="+rollNo);
       System.out.println("Name="+name);
       System.out.println("Per="+per);
   }

}

