public class A44_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // Check if the prices array is null or has less than 2 elements
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];  // Initialize the minimum price as the first element
        int maxProfit = 0;  // Initialize the maximum profit as 0

        // Traverse the array starting from the second element
        for (int i = 1; i < prices.length; i++) {
            // If the current price is less than the minimum price, update the minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // If the current price is greater than or equal to the minimum price,
                // calculate the current profit by subtracting the minimum price from the current price
                int currentProfit = prices[i] - minPrice;
                // Update the maximum profit if the current profit is greater
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;  // Return the maximum profit
    }


public class Main {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        A44_BestTimeToBuyAndSellStock solution = new A44_BestTimeToBuyAndSellStock();
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
}