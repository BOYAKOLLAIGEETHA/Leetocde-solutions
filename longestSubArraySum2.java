//Longest Subarray with Sum K (Including Negative Numbers)
import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarraySumWithNegatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int k = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            
            if (sum == k) {
                maxLength = i + 1;
            }
            
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            
            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }
        }
        
        System.out.println("Longest subarray with sum " + k + ": " + maxLength);
    }
}
