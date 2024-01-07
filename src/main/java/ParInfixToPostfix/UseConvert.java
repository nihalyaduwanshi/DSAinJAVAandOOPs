package ParInfixToPostfix;

import java.util.Scanner;

public class UseConvert {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str;
        System.out.println("Enter a valid infix expression:");
        str=sc.next();
        Convert convert=new Convert(str);
        convert.toPostfix();
        System.out.println(convert);
    }
}
