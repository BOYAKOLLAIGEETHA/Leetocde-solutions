// Longest Consecutive Sequence in an Array
import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int maxLength = 0;
        
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        System.out.println("Longest Consecutive Sequence: " + maxLength);
    }
}
