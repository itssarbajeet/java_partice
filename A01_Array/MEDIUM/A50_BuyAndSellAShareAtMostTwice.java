
class SolutA50_BuyAndSellAShareAtMostTwiceion {
    public static int maxProfit(int n, int[] prices) {
          if (prices == null || prices.length < 2) {
            return 0;
        }
        
        int[] leftProfit = new int[n];
        int[] rightProfit = new int[n];
        
        // Calculate maximum profit by doing one transaction from left to right
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            leftProfit[i] = Math.max(leftProfit[i - 1], prices[i] - minPrice);
        }
        
        // Calculate maximum profit by doing one transaction from right to left
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            rightProfit[i] = Math.max(rightProfit[i + 1], maxPrice - prices[i]);
        }
        
        // Calculate maximum profit by doing two transactions
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, leftProfit[i] + rightProfit[i]);
        }
        
        return maxProfit;
    }
    public static void main(String args[]){
        int []prices={10,22, 5 ,75, 65 ,80};
        System.out.println(maxProfit(prices.length,prices));

    }
}
/*
 * In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day, the second transaction can only start after the first one is complete (Buy->sell->Buy->sell). The stock prices throughout the day are represented in the form of an array of prices. 

Given an array price of size N, find out the maximum profit that a share trader could have made.

Example 1:

Input:
6
10 22 5 75 65 80
Output:
87
Explanation:
Trader earns 87 as sum of 12, 75 
Buy at 10, sell at 22, 
Buy at 5 and sell at 80
Example 2:

Input:
7
2 30 15 10 8 25 80
Output:
100
Explanation:

Trader earns 100 as sum of 28 and 72
Buy at price 2, sell at 30,
Buy at 8 and sell at 80
Your Task:

Complete the function maxProfit() which takes an integer array price as the only argument and returns an integer, representing the maximum profit, if only two transactions are allowed.

Expected Time Complexity: O(N)

Expected Space Complexity: O(N)
 */
        


 