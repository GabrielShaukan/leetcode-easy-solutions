package Problems;

public class Problem121_BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int answer = 0;
        int subtractionValue;
        int j = 0;
        for(int i = 0; i < prices.length; i++) {
            subtractionValue = prices[i];
            System.out.println(subtractionValue);
            j=i;
            while (j < prices.length) {
                if (prices[j] - subtractionValue > answer) answer = prices[j] - subtractionValue;
                j++;
            }
        }
        return answer;
    }

}
