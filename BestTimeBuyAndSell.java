import java.util.*;

public class BestTimeBuyAndSell{
    public static int maxProfit(int[] prices) {
        int length = prices.length;
        boolean descen = true;
        for(int i = 0 ; i < length - 1; ++i){
            if(prices[i] < prices[i + 1]){
                descen = false;
                break;
            }
        }
        if(descen == true || length == 1 || length == 0)
            return 0;

        int profit = 0;
        int buy = prices[0];

        for(int i = 1; i < length; ++i){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else if(prices[i] - buy > profit)
                profit = prices[i] - buy;
        }
        return profit;
    }


    // public int maxProfitAdvance(int[] prices) {
        
    // }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        // int[] prices = {7,6,4,3,1};

        System.out.println(maxProfit(prices));
    }
}