import java.util.*;

public class TwoSum {
    public static int[] twoSum(int arr[], int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int more = target - arr[i];
            if (map.containsKey(more)){
                return new int[] {i, map.get(more)};
            }
            map.put(arr[i], i);
        }
        return new int[] {0, 0};
    }
    public static void main(String args[]){
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int ans[] = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
