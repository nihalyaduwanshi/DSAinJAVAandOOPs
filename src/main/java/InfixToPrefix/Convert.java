package InfixToPrefix;


import java.util.Stack;

public class Convert {
    private String infix;
    private String prefix;

    public Convert(String infix){
        this.infix=infix;
        prefix=" ";
    }
    public boolean isOperand(char ch){
        if(ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch>=48 && ch<=57)
            return true;
        return false;
    }
    public void toPrefix(){
        Stack<Character>st=new Stack<>();
        for (int i=infix.length()-1;i>=0;i--){
            char ch=infix.charAt(i);
            if (isOperand(ch)) {
                prefix+=ch;
            }else {
                while (st.empty()==false){
                    if (precedence(ch)>=precedence(st.peek()))
                         break;
                         prefix+=st.pop();
                    }
                    st.push(ch);

                }
            }
            while (st.empty()==false){
                prefix+=st.pop();
            }
            prefix=new StringBuffer(prefix).reverse().toString();
        }


    int precedence(char ch){
        if (ch=='&')
            return 3;
        else if (ch=='/' || ch=='*' || ch=='%')
            return 2;
        else if (ch=='+' || ch=='-')
            return 1;
        else
            return 0;
    }
    public String toString(){
        return "infix:"+infix+"\nprefix:"+prefix;
    }

}