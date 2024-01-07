package PlaPractice;

import java.util.Scanner;

public class Read {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c;
        int n=10;
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
