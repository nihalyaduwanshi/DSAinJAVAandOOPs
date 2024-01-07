package ALCQueueExample3;


import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class UseQueue3 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedBlockingQueue<>(3);
        q.add(10);
        System.out.println("After adding 10:"+q);
        q.add(20);
        System.out.println("After adding 20:"+q);
        q.add(30);
        System.out.println("After adding 30:"+q);
        q.add(40);
        System.out.println("After adding 40:"+q);//queue is full
      }
}
