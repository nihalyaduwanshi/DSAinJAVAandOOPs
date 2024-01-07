package Practice;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ALEx1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x*15>=y*2){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
     }
