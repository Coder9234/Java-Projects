public class arraysTwo {

    // Max Subarray Sum (Prefix Sum)
    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++){
            int start = i;
        
            for (int j = i; j < numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is: " + maxSum);
    }

    // Kadane;s Algorithm
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numbers.length; i++){
            cs = cs + numbers[i];
            if (cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our maximum sum is: " + ms);
    }

    // Trapping rainwater
    public static int rainwater(int height[]){
        int n = height.length;
        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // calculate right max- boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        } 
        
        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++){
            // waterlevel = min(leftMax boundary, rightMax boundary)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    // Buy & Sell stocks
    public static int buy_sell_stocks(int prices[]){
        int n = prices.length;
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            // Profit
            if (buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit); // today's profit
            }
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        // int numbers[] = {1, -2, 6, -1, 3};
        // maxSubarraySum(numbers);

        // Kadane's algorithm
        // int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // kadanes(numbers);

        // Trapping rainwater
        // int height[] = {4, 2, 0, 6, 3, 2, 5};
        // System.out.println(rainwater(height)); 
        
        // Buy & Sell Stock
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buy_sell_stocks(prices));
    }
}
