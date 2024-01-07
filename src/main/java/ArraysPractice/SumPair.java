package ArraysPractice;

public class SumPair {
    public static int sumPair(int arr[],int target){
        int sum=0,count=0;
        int start=0,end=arr.length-1;
        while (start<end){
            sum=arr[start]+arr[end];
            if (sum==target){
                count++;
                start++;
                end--;
            }else if (sum>target){
                end--;
            }else{
                start++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(sumPair(arr,6));
    }
}
