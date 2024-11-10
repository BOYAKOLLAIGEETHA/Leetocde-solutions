//Largest Subarray with 0 Sum

import java.util.HashMap;
import java.util.Scanner;

public class LargestSubarrayWithZeroSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0, sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            
            if (sum == 0) {
                maxLength = i + 1;
            } else if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        
        System.out.println("Largest Subarray with 0 Sum: " + maxLength);
    }
}
