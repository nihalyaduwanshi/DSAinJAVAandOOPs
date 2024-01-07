package staticMethods;

class MyMath{
    public static int add(int a,int b){
        return a+b;
    }
}
public class StaticDemo3 {
    public static void main(String[] args) {
        System.out.println("Sum ="+MyMath.add(10,20));
    }
}
