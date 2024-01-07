package PostifixEvaluation;

import java.util.Scanner;

public class UsePostfixEvaluation {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str;
        System.out.println("Enter a valid postfix exp:");
        str=kb.next();
        PostfixEvaluation obj=new PostfixEvaluation(str);
        float res;
        res=obj.evaluate();
        System.out.println("Result is:"+res);
    }
}
