public class InversionCount {
    public static int count(int arr[], int left, int mid, int right){
        int i = left;
        int j = mid;
        int k = 0;
        int count = 0;
        int temp[] = new int[right - left + 1];
        while(i < mid && j <= right){
            if (arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                count += (mid - i);
                j++;
            }
            k++;   
        }

        while (i < mid){
            temp[k++] = arr[i++];
        }
        while (j <= right){
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++){
            arr[i] = temp[k];
        }  
        return count;
    }

    public static int InversionCount(int nums[], int left, int right){
        int count = 0;
        if (right > left){
            int mid = (left + right) / 2;

            count = InversionCount(nums, left, mid);
            count += InversionCount(nums, mid + 1, right);
            count += count(nums, left, mid + 1, right);
        }
        return count;
    }

    public static int printArr(int nums[]){
        return InversionCount(nums, 0, nums.length - 1);
    }
    public static void main(String ags[]){
        int nums[] = {1, 2, 3, 4, 5};
        System.out.println("Inversion count: " + printArr(nums));
    }
}


