class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int price: prices){
        int left = 0;
        int right = prices.length - 1;
            int profit = prices[right] - prices[left];
            maxProfit = Math.max(profit,maxProfit);
        }
   return maxProfit;
            
        }
    }

