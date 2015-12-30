package ProjectFiles;

public class BestTimetoBuyandSellStockII {

	public static void main(String[] args) {

	}

	public int maxProfit(int[] prices) {
		int result = 0, purchase = -1, sell = -1, i = 0;
		while(true){
			
				while( i+1 < prices.length && prices[i+1] < prices[i])
					i++;
				
				if(i < prices.length){
					purchase = i++;
					}
				else
					break;
				
				while(i + 1 < prices.length && prices[i+1] > prices[i])
					i++;
				if(i < prices.length){
					sell = i++;
					result += prices[sell] - prices[purchase]; 
					}
				else
					break;
			}

		return result;
	}

}
