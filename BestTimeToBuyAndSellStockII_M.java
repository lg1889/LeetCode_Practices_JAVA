/**
 * Say you have an array for which the ith element is the price of a given
 * stock on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete 
 * <strong>as many transactions as you like</strong> (ie, buy one and sell 
 * one share of the stock multiple times). However, you may not engage in
 * multiple transactions at the same time (ie, you must sell the stock 
 * before you buy again).
 * 
 * Tags: Array, Greedy
 */


public class Solution {
	public static void main(String[] args) {
        int[] prices = { 1, 2, 10, 100 };
        System.out.println(maxProfit(prices));
    }



	/**
     * Sell whenever there is profit.
     * If next value is bigger, add the difference up to the profit
     */
    public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}        
		int sum = 0;
		for (int i = 1; i < prices.length; i++) {
			int diff = prices[i] - prices[i - 1];
			if (diff > 0) {
				sum = sum + diff;
			}
		}
		return sum;
    }
}