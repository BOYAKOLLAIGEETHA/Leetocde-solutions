//Sort an Array of 0’s, 1’s, and 2’s
import java.util.Scanner;

public class SortColors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int low = 0, mid = 0, high = n - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
        
        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
