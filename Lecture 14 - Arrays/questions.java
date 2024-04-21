public class questions {
    // Q1.
    public static boolean twice(int nums[]){
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }  
            }
        }
        return false;
    }

    // Q2.
    public static int target(int nums[], int target){
        for (int i = 0; i < nums.length; i++){
            if (target == nums[i]){
                return i;
            }
        }
        return -1;
    }

    // Q3.
    public static int triplet(int nums[]){
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    if (nums[i] + nums[j] + nums[k] == 0){
                        System.out.println("(" + nums[i] + "," + nums[j] + "," + nums[k] + ")");
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String args[]){
        // Q1.
        // int nums[] = {1, 2, 3, 4};
        // System.out.println(twice(nums));

        // Q2.
        // int nums[] = {4, 5 ,6 ,7, 0, 1, 2};
        // int target = 3;
        // System.out.println(target(nums, target));

        // Q5.
        int nums[] = {};
        System.out.println(triplet(nums));
    }

}
