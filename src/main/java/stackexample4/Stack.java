package stackexample4;

import stackexample3.StackException;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer>arr;
    private int tos;
    public Stack(){
        arr=new ArrayList<Integer>();
        tos=-1;
    }
    public void push(int x){
        tos++;
        arr.add(tos);
    }
    public int pop(){
        if (tos==-1){
            throw new StackException("Stack Underflow");
        }
        int x=arr.remove(tos);
        --tos;
        return x;
    }
    public int peek(){
        if (tos==-1){
            throw new StackException("Stack Underflow");
        }
        int x=arr.get(tos);
        return x;
    }
}
