package ArraysPractice;

import java.util.Arrays;

public class SwapEveryPair {
    public static void swapAlternate(int arr[]){   //Input =9,3,6,12,4,32
             int temp;                                     // Output=3,9,12,6,32,4
            for (int i=0;i<arr.length-1;i+=2){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
    }

    public static void main(String[] args) {
        int arr[]={9,3,6,12,4,32};
        System.out.println("Before swapping");
        System.out.println(Arrays.toString(arr));

        swapAlternate(arr);
        System.out.println("After swapping");
        System.out.println(Arrays.toString(arr));
    }
}
