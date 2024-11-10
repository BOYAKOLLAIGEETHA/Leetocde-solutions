// Longest Subarray with Given Sum K (Positive Numbers Only)
import java.util.Scanner;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int k = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int start = 0, sum = 0, maxLength = 0;
        
        for (int end = 0; end < n; end++) {
            sum += nums[end];
            
            while (sum > k) {
                sum -= nums[start];
                start++;
            }
            
            if (sum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }
        
        System.out.println("Longest subarray with sum " + k + ": " + maxLength);
    }
}
