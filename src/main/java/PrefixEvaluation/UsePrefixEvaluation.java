package PrefixEvaluation;

import java.util.Scanner;

public class UsePrefixEvaluation {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str;
        System.out.println("Enter a valid postfix exp:");
        str=kb.next();
        PrefixEvaluation obj=new PrefixEvaluation(str);
        float res;
        res=obj.evaluate();
        System.out.println("Result is:"+res);
    }
}
