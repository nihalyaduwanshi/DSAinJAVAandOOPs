package Sorting;

public class InsertionSort {
    public static void Insertion(int arr[]){
        int i,j,temp;
        for (i=0;i<arr.length-1;i++){
            for(j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={150,5,230,20};
        Insertion(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
