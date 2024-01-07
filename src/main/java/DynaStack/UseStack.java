package DynaStack;

public class UseStack {
    public static void main(String[] args) {
        Stack st=new Stack();
        System.out.println("Stack size:"+st.size());
        System.out.println("Stack is empty:"+st.isEmpty());
        st.push(10);
        st.push(20);
        System.out.println("Stack size:"+st.size());
        System.out.println("Stack is empty:"+st.isEmpty());
        System.out.println("Top element:"+st.peek());
        System.out.println("Popped element:"+st.pop());
        System.out.println("Stack size:"+st.size());
        System.out.println("Stack is empty:"+st.isEmpty());
    }
}
