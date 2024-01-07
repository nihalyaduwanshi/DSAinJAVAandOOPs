package DynaQueue;


public class UseQueue {
    public static void main(String[] args) {
        Queue qu = new Queue();
        System.out.println("Stack size:" + qu.size());
        System.out.println("Stack is empty:" + qu.isEmpty());
        qu.insert(10);
        qu.insert(20);
        System.out.println("Stack size:" + qu.size());
        System.out.println("Stack is empty:" + qu.isEmpty());
        System.out.println("Top element:" + qu.peek());
        System.out.println("Popped element:" + qu.delete());
        System.out.println("Stack size:" + qu.size());
        System.out.println("Stack is empty:" + qu.isEmpty());
    }
}
