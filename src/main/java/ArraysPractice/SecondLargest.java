package ArraysPractice;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={9,9,9,9};
        int firstLargest=Math.max(arr[0],arr[1]);
        int secondLargest=Math.min(arr[0],arr[1]);

        for(int i=0;i<arr.length;i++){
            if(firstLargest<arr[i]){
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }
            else if(secondLargest<arr[i] && secondLargest!=firstLargest){
                secondLargest=firstLargest;
            }
        }
        System.out.println(secondLargest);
    }
}
