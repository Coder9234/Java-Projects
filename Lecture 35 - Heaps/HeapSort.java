import java.util.*;

public class HeapSort {
    public static void heapify(int arr[], int i , int size){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxi = i;
        if (left < size && arr[left] > arr[maxi]){
            maxi = left;
        }
        if (right < size && arr[right] > arr[maxi]){
            maxi = right;
        }
        if (maxi != i){
            // swap
            int temp = arr[i];
            arr[i] = arr[maxi];
            arr[maxi] = temp;

            heapify(arr, maxi, size);
        }
    }


    public static void HeapSort(int arr[]){
        // step 1 - build maxHeap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--){
            heapify(arr, i, n); // (n/2 * logn) => O(nlogn)
        }
        // step2 - push largest at the end
        for (int i = n - 1; i >= 0; i--){
            // swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 4, 5, 3};
        HeapSort(arr);

        // print
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
