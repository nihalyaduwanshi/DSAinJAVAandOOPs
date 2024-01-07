package ArraysPractice;

import java.util.Arrays;
public class ZerosOnesTwos {
    public static void sort012(int arr[]){
        int left=0,right=arr.length-1;
        int current=0,temp;
        while (current<=right){
            if(arr[current]==0){
                temp=arr[left];
                arr[left]=arr[current];
                arr[current]=temp;
                left++;
                current++;
            } else if (arr[current]==2) {
                temp=arr[current];
                arr[current]=arr[right];
                arr[right]=temp;
                right--;
            }else {
                current++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,0,0,0,1,2};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}

