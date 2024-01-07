package ArgumentPassing;

class MyMath{
     public void add(int a,int b) {//forma argu..
         int c=a+b;
         System.out.println("Sum is="+c);
     }
}
public class ArguPasDemo1 {
    public static void main(String[] args) {
        MyMath m=new MyMath();
        int x=10,y=20;
        m.add(x,y);//actual arg
    }
}
