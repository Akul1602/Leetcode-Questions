package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //reverse
//        for(int i = 0;i<n/2;i++){
//            int j = n-1-i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
        int i = 0, j= n-1;
//        int i = 1, j= 5; => to reverse a part of an array
        while (i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
