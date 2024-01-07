//package Heap;
//
//public class Heap {
//    private int[] arr;
//    private int count;
//    public Heap(int size){
//        arr=new int[size];
//        count=0;
//    }
//    public void insert(int x){
//        count++;
//        int parIndex, childIndex=count;
//        while (childIndex>1)
//            parIndex=childIndex/2;
//        if (arr[parIndex]>x){
//            arr[childIndex]=x;
//            return;
//        }
//        arr[childIndex]=arr[parIndex];
//        childIndex=parIndex;
//
//    }
//       public void display(){
//        for(int i=1;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//       }
//}
