import java.util.ArrayList;
public class ContainerWithWater2Pointer {
    // 2 Pointer Approach - O(n)
    public static int storeWater(ArrayList<Integer>height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp){
            int h = Math.min(height.get(lp), height.get(rp));
            int w = rp - lp;
            int currWater = h * w;
            maxWater = Math.max(maxWater, currWater);
            if (height.get(lp) < height.get(rp)){
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}
