import java.util.ArrayList;
import java.util.Collections;
public class MonotonicArrayList {
    // O(n^2)
    public static boolean increasing(ArrayList<Integer>nums){
        boolean flag = true;
        for (int i = 0; i < nums.size() - 1; i++){
            for (int j = i + 1; j < nums.size() - 1; j++){
                if (nums.get(i) > nums.get(j))
                {
                    return false;
                }
            }
        }
        return flag;
    }
    public static boolean decreasing(ArrayList<Integer>nums){
        boolean flag = true;
        for (int i = 0; i < nums.size() - 1; i++){
            for (int j = i + 1; j < nums.size() - 1; j++){
                if (nums.get(i) < nums.get(j))
                {
                    return false;
                }
            }
        }
        return flag;
    }
    // O(n)
    public static boolean solve(ArrayList<Integer>nums){
        int n = nums.size();
        boolean flag1 = true, flag2= true;

        for(int i=0; i<n-1; i++){
            if(nums.get(i) <= nums.get(i+1)){
                if(!flag1) return false;
                flag2 = false;
                continue;
            }
            if(nums.get(i) >= nums.get(i+1)){
                if(!flag2) return false;
                flag1 = false;
                continue;
            }
        }
        return flag1 ||flag2;
    }
    

    public static void main(String args[]){
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(3);
        // O(nlogn)
        // After using deep copy
        // ArrayList<Integer> num1 = new ArrayList<>(), num2 = new ArrayList<>();
        // num1 = nums; num2 = nums;
        // Collections.sort(num1);
        // Collections.sort(num2);
        // Collections.reverse(num2);
        // System.out.println(nums == num1 || nums == num2);
        System.out.println(solve(nums));
        // System.out.println(increasing(nums)|| decreasing(nums));
    }
}
