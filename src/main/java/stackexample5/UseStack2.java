package stackexample5;


import java.util.Stack;

public class UseStack2 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        while (st.empty()==false){
            System.out.println(st.pop());
        }

    }
}
