import java.util.ArrayList;
public class PairSum12Pointer {
    // 2 Pointer Approach - O(n)
    public static boolean PairSum(ArrayList<Integer>list, int target){
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp){
            // Case 1
            if (list.get(lp) + list.get(rp) == target){
                return true;
            }
            // Case 2
            else if (list.get(lp) + list.get(rp) < target){
                lp++;
            }
            // Case 3
            else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(PairSum(list, target));
    }
}
