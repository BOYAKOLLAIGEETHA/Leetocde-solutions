//rotate the array to the right by k steps
import java.util.Scanner.*;

public class RotateArray {
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
        
        // Take the number of rotation steps (k) as input
        System.out.print("Enter the number of steps to rotate: ");
        int k = scanner.nextInt();
        
        // Rotate the array
        rotateArray(nums, k);
        
        // Display the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(nums));
        
        scanner.close();
    }
    
    // Method to rotate the array to the right by k steps
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Adjust k if it's larger than the array size

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }
    
    // Helper method to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
