// 2Sum Problem
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int target = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " and " + i);
                return;
            }
            
            map.put(nums[i], i);
        }
        
        System.out.println("No two numbers found with the given sum.");
    }
}
