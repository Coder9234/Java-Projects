import java.util.Collections;
import java.util.ArrayList;
public class LonelyNumbers {
    public static void lonely(ArrayList<Integer>nums){
        Collections.sort(nums);
        ArrayList<Integer>list = new ArrayList<>();
        int x;
        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)){
                list.add(nums.get(i));
            }
        }
        if (nums.size() == 1){
            list.add(nums.get(0));
        }
        if (nums.size() > 1){
            if (nums.get(0) + 1 < nums.get(1)){
                list.add(nums.get(0));
            }
        }
    }
    public static void main(String args[]){
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
    }
}
