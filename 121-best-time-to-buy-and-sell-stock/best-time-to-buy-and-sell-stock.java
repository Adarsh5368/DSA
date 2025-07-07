class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
         for (int price : prices){
            min = Math.min(price,min);
            maxprofit = Math.max(maxprofit,price-min);
         }
         return maxprofit;
        
    }
}

//isme har iteration me ham minimum price find krte abd max profit according to this min price