public class Majority {
    public static int count(int nums[], int num, int si, int ei){
        int count = 0;
        for (int i = si; i <= ei; i++){
            if (nums[i] == num){
                count++;
            }
        }
        return count;
    }

    public static int majorityElement(int nums[], int si, int ei){
        if (si == ei){
            return nums[si];
        }
        int mid = (si + ei) / 2;
        int left = majorityElement(nums, si, mid);
        int right = majorityElement(nums, mid + 1, ei);

        if (left == right){
            return left;
        }

        int leftCount = count(nums, left, si, ei);
        int rightCount = count(nums, right, si, ei);

        if (leftCount > rightCount){
            return left;
        }
        else{
            return right;
        }
    }

    public static int printArr(int nums[]){
        return majorityElement(nums, 0, nums.length - 1);
    }
    public static void main(String args[]){
        int nums[] = {3, 2, 3};
        System.out.println(majorityElement(nums, 0, nums.length - 1));
        printArr(nums);
    }
}
