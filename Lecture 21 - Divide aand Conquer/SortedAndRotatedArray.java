public class SortedAndRotatedArray {
    public static int search(int arr[], int target, int si, int ei){
        if (si > ei){
            return -1;
        }
        int mid = (si+ ei) / 2;
        if (arr[mid] == target){
            return mid;
        }
        // mid lie on L1
        if (arr[si] <= arr[mid]){
            // case 1: left
            if (arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid - 1);
            }
            else {
                // case 2: right
                return search(arr, target, mid + 1, ei);
            }
        }
        // mid lie on L2
        else {
            // case c: right
            if (arr[mid] <= target && target<= arr[ei]){
                return search(arr, target, mid + 1, ei);
            }
            else {
                search(arr, target, si, mid - 1);
            }
        }
        return search(arr, target, si, ei);
    }
    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2}; 
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}
