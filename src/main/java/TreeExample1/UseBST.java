package TreeExample1;

public class UseBST {
    public static void main(String[] args) {
        BST tree=new BST();
        tree.append(10);
        tree.append(5);
        tree.append(20);
        tree.append(2);
        tree.append(8);
        tree.append(15);
        tree.append(30);
        tree.preorder();
    }
}
