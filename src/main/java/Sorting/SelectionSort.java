package Sorting;

public class SelectionSort {
    public static void Selection(int arr[]){
        int i,j,temp,min;
        for (i=0;i<arr.length-1;i++){
            min=i;
            for (j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={20,10,30,40,50};
        Selection(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
