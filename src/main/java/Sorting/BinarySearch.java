package Sorting;

public class BinarySearch {
    public static int isBinary(int arr[],int val){
        int low=0,high=arr.length-1,mid;
        while (low<=high){
            mid=(low+high)/2;
            if(arr[mid]==val)
                return mid;
            if(val<arr[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(isBinary(arr,40));
    }
}
