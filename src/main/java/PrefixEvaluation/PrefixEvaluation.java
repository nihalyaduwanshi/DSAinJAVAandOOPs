package PrefixEvaluation;

import java.util.Stack;

public class PrefixEvaluation {
    private String prefix;

    public PrefixEvaluation(String postfix) {
        this.prefix = postfix;
    }
    public  float evaluate(){

        Stack<Float> st=new Stack<>();
        float res;
        for(int i=prefix.length()-1;i>=0;i--){
            char ch= prefix.charAt(i);
            if(isOperand(ch)==true){
                st.push((float)(ch-'0'));
            }else{
                if(st.size()<2){
                    System.out.println("Invalid Postfix");
                    return 0.0f;
                }
                float op1=st.pop();
                float op2=st.pop();

                res=calculate(op1,op2,ch);
                st.push(res);
            }
        }
        res=st.pop();
        return res;

    }
    public  boolean isOperand(char ch){
        return ch>=48 && ch<=57;
    }
    public  float calculate(float op1,float op2,char op){
        switch(op){
            case '+':
                return op1+op2;
            case '-':
                return op1-op2;
            case '*':
                return op1*op2;
            case '$':
                return (float)Math.pow(op1,op2);
            case '/':
                return op1/op2;
            case '%':
                return op1%op2;
            default:
                return 0.0f;
        }
    }

}
