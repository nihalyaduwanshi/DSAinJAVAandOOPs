package ArraysPractice;

import java.util.Arrays;

public class Duplicate {
    public static void findDuplicate(int arr[]){
        int temp=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,1,4,5};
        findDuplicate(arr);

    }
}
