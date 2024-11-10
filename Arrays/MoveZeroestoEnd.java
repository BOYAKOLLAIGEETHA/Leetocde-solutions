import java.util.Scanner;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take the size of the array as input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        // Initialize the array and take elements as input
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Move zeros to the end
        moveZeros(nums);
        
        // Display the modified array
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(nums));
        
    }
    
    // Method to move all zeros to the end of the array
    public static void moveZeros(int[] nums) {
        int pos = 0; // Pointer for the position to place non-zero elements
        
        // Loop through the array
        for (int num : nums) {
            // If the current element is not zero, place it at 'pos' index
            if (num != 0) {
                nums[pos] = num;
                pos++; // Move the pointer to the next position
            }
        }
        
        // Fill the remaining positions with zeros
        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
    }
}
