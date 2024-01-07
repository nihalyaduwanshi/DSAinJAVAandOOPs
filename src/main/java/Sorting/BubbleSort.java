package Sorting;

import java.lang.reflect.Array;

public class BubbleSort {
    public static void Bubble(int arr[]){
        int i,j,temp;
        for (i=0;i<arr.length-1;i++){
            boolean isSwapped=false;
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped)
                break;
        }
    }

    public static void main(String[] args) {
        int arr[]={2,3,1,7,4,8};
        Bubble(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
