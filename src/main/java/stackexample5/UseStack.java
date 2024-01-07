package stackexample5;


import java.util.Iterator;
import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        Iterator<Integer>it=st.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
