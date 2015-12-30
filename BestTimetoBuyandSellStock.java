package ProjectFiles;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{2,4,1,5,8,19}));
		System.out.println(maxProfit(new int[]{2}));
		System.out.println(maxProfit(new int[]{}));
		System.out.println(maxProfit(new int[]{2,1}));
	}
	
    public static int maxProfit(int[] prices) {
    	if(prices == null || prices.length == 0 || prices.length == 1)
        	return 0;
    	int min = prices[0];
        int result = 0;
        
	        for(int i = 1; i < prices.length; i++){
	        	int price = prices[i];
	        	if((price - min ) > result){
	        		result = price - min;
	        	}
	        	if(price < min)
	        		min = price;
	        }
        return result;
    }

}
