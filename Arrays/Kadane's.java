//Kadane's Algorithm (Maximum Subarray Sum)
import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int maxSum = nums[0], currentSum = nums[0];
        
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
