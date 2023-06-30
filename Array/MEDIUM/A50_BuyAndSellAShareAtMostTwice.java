
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
        

