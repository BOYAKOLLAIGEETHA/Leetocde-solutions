//Find the Number That Appears Once (All Others Appear Twice)
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int single = 0;
        
        for (int num : nums) {
            single ^= num; // XOR of all elements gives the single element
        }
        
        System.out.println("The single number is: " + single);
    }
}
