public class questions {
    public static void PrintArr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void BubbleSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] < arr[j + 1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++){
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }   
    
    public static void InsertionSort(int arr[]){
        for (int i = 0; i < arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--){
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // BubbleSort(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        CountingSort(arr);
        PrintArr(arr);

    }
}
