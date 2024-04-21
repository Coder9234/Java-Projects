import java.util.*;

public class MaxLengthPairs {
    public static void main(String args[]){ //O(nlogn)
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int pairEnd = pairs[0][1]; // Last Selected pair end
        for (int i = 1; i < pairs.length; i++){
            if (pairs[i][0] > pairEnd){
                chainLength++;
                pairEnd = pairs[i][1];
            }
        }
        System.out.println("Maximum length of chain: " + chainLength);
    }
}
