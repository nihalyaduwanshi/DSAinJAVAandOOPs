package ThisKeyword;

public class Student {
    private int roll;
    private String name;
    private double per;

    public void setStudent(int roll,String name,double per){

        this.roll=roll;
        this.name=name;
        this.per=per;
    }
    public void showStudent(){
        System.out.println("Roll="+roll+",Name="+name+",Per="+per);
    }
}
