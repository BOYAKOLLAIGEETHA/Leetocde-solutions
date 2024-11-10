// Count Subarrays
import java.util.HashMap;
import java.util.Scanner;

public class CountSubarraysWithSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int target = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // For sum 0, there's one subarray (empty subarray)
        int count = 0, sum = 0;
        
        for (int num : nums) {
            sum += num;
            
            if (map.containsKey(sum - target)) {
                count += map.get(sum - target);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        System.out.println("Count of subarrays with sum " + target + ": " + count);
    }
}
