//Majority Element
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int candidate = nums[0], count = 1;
        
        // Boyer-Moore Voting Algorithm to find candidate
        for (int i = 1; i < n; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }
        
        // Verify if candidate is majority
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        
        if (count > n / 2) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element");
        }
    }
}
