import java.util.*;
class Solution {
    /*public int maxProfit(int[] prices) {
        int minimum = prices[0];
        for(int i=0; i<prices.length; i++){
            minimum = Math.min(minimum, prices[i]);
        }
        int min_idx = 0;
        for(int i=0; i<prices.length; i++){
            if(minimum == prices[i]){
                min_idx = i;
            }
        }
        int profit = 0;
        for(int j = min_idx+1; j<prices.length; j++){
            profit = Math.max(profit,prices[j]-minimum);
        }
        if(profit < 0){
            return 0;
        }
        else{
            return profit;
        }
        
    }
    */
    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int profit = 0;
        for( int i=0; i<prices.length; i++){
            if( prices[i] < minimum){
                minimum = prices[i];
            }
            profit = Math.max(profit,prices[i]-minimum);
        }
        return profit;
    }
}