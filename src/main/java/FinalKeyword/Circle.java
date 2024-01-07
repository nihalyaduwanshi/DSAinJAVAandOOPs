package FinalKeyword;

public class Circle {
    private int rad;
    private final double pi=3.14;//pi ki value constructor me bhi intislaized kar sakte hai..
    public Circle(int r){
        rad=r;
    }
    public void show(){

        System.out.println("Radius is="+rad);
        System.out.println("Pi is ="+pi);
    }
}
