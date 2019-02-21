package ArrayQuestions;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by STEFY on 15/01/2019.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfitN2(int[] prices) {
        int maxPro = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int pro = prices[j] - prices[i];
                if (pro > maxPro) maxPro = pro;
            }
        }
        return maxPro;
    }

    public int maxProfitN(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
