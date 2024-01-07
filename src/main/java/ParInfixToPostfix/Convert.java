package ParInfixToPostfix;


import java.util.Stack;

public class Convert {
    private String infix;
    private String postfix;

    public Convert(String infix){
        this.infix=infix;
        postfix=" ";
    }
    public boolean isOperand(char ch){
        if(ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch>=48 && ch<=57)
            return true;
        return false;
    }
    public void toPostfix(){
        Stack<Character> st=new Stack<>();
        for (int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            if(ch=='(')
                st.push('(');
            else if(ch==')'){
                while (st.peek()!='('){
                    postfix+=st.pop();
                }
                st.pop();
            }
            else if(isOperand(ch)){
                postfix+=ch;
            }else {
                while (st.empty()==false){
                    if(st.peek()=='(')
                        break;
                    if (precedence(ch)>precedence(st.peek()))
                        break;
                    postfix+=st.pop();
                }
                st.push(ch);
            }
        }
        while (st.empty()==false){
            postfix+=st.pop();
        }
    }
    int precedence(char ch){
         if(ch=='$')
             return 3;
         else if (ch=='/' || ch=='*' || ch=='%')
             return 2;
         else if (ch=='+' || ch=='-')
             return 1;
         else
             return 0;


    }
    public String toString(){
        return "infix:"+infix+"\nPostfix:"+postfix;
    }
}
