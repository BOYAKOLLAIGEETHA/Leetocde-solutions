//Stock Buy and Sell (Best Time to Buy and Sell Stock)
import java.util.Scanner;

public class StockBuySell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] prices = new int[n];
        
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        
        int minPrice = prices[0], maxProfit = 0;
        
        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
