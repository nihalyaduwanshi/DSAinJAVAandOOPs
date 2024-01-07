package TreeExample1;


import javax.swing.*;
import java.util.Stack;

public class BST {
    private Node root;
    public void append(int x) {
        Node p = new Node(x);
        if (root==null){
            root=p;
            return;
        }
        Node temp=root;
        Node prev=null;
        while (temp!=null){
            prev=temp;
            if (temp.getData()>x){
                temp=temp.getLeft();
            }else {
                temp=temp.getRight();
            }
        }
        if (prev.getData()>x){
            prev.setLeft(p);
        }else {
            prev.setRight(p);
        }
    }
    public void preorder(){
        if(root==null){
            System.out.println("Tree is Empty");
            return;
        }

        Stack<Node>st=new Stack<>();
        Node temp=root;
        st.push(temp);
        while (!st.isEmpty()){
            temp=st.pop();
            while (temp!=null){
                System.out.println(temp.getData());
                if (temp.getRight()!=null){
                    st.push(temp.getRight());
                }
                temp=temp.getLeft();

            }
        }
        }
    public void Inorder() {
        if (root == null) {
            System.out.println("Empty Tree");
            return;
        }
        Stack<Node> st = new Stack<>();
        Node temp = root;
        while (temp!=null || st.isEmpty()==false) {
            while (temp != null) {
                st.push(temp);
                temp = temp.getLeft();
            }
            temp = st.pop();
            System.out.println(temp.getData());
            temp = temp.getRight();
        }
    }
    public void postorder(){
        if(root==null){
            System.out.printf("Empty tree");
            return;
        }
        Stack<Node>st=new Stack<>();
        Node temp=null;
        int flag;
        while (temp!=null || st.isEmpty()==false) {
            while (temp != null) {
                st.push(temp);
                if (temp.getRight() != null) {
                    temp.getRight();
                    flag = -1;
                    st.push(temp.getRight());
                }
                temp = temp.getLeft();

                temp = st.pop();
                if (temp.flag == 0) {
                    temp = null;
                    System.out.println(temp.getData());
                } else {
                    temp.flag = 0;
                }
            }
        }
//        public Node[] search(int x){
//            Node []result=null;
//            Node child=null,par=null;
//            child=root;
//            while(child!=null){
//                if(child.getData()==x){
//                    result=new Node[2];
//                    result[0]=par;
//                    result[1]=child;
//                    return result;
//                }
//                par=child;
//                if(child.getData()>x){
//                    child=child.getLeft();
//                }else {
//                    child=child.getRight();
//                }
//            }
//            return null;
////       }
    }
}
