//finding the missing element in the array
import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take the size of the array as input (this should be n - 1 for an array missing one number)
        System.out.print("Enter the size of the array (excluding the missing number): ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array (values from 1 to " + (n + 1) + " with one missing):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Find and display the missing number
        int missingNumber = findMissingNumber(nums, n + 1); // n + 1 is the full count
        System.out.println("The missing number is: " + missingNumber);
        
    }
    
    // Method to find the missing number in the array
    public static int findMissingNumber(int[] nums, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of the elements in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // The missing number is the difference between expectedSum and actualSum
        return expectedSum - actualSum;
    }
}
