public class MergeStrings {
    public static String[] mergeSort(String arr[], int si, int ei){
        if (si == ei){
            String a[] = {arr[si]};
            return a;
        }
        int mid = (si + ei) / 2;
        String arr1[] = mergeSort(arr, si, mid); // left part
        String arr2[] = mergeSort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei, arr1, arr2);
        return mergeSort(arr, si, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei, String arr1[], String arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei){
            if (comparitor(arr1[i], arr2[j])){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid){
            temp[k++] = arr[i++];
        }
        while (j <= ei){
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static boolean comparitor(String str1, String str2){
        if (str1.compareTo(str2) < 0){
            return true;
        }
        return false;
    }

    public static void printArr(String arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        String arr[] = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
