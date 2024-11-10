
import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int maxOnes = 0, count = 0;
        
        for (int num : nums) {
            if (num == 1) {
                count++;
                maxOnes = Math.max(maxOnes, count);
            } else {
                count = 0;
            }
        }
        
        System.out.println("Maximum Consecutive Ones: " + maxOnes);
    }
}
