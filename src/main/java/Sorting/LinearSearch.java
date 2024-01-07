package Sorting;

public class LinearSearch {
    public static int LinearSear(int arr[],int val){

        for (int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
//Best case (O)1,worst case O(n),average case O(n)
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(LinearSear(arr,30));

        System.out.println(LinearSear(arr,89));
    }
}
