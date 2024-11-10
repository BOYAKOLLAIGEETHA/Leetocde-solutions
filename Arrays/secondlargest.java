import java.util.Scanner;

public class SecondLargestElement {

    public static int SecondLargest(int[] a) {
        if (a == null || a.length < 2) {
            return -1; // if array has less than 2 elements, return -1
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > first) {
                // Update both first and second if num is greater than first
                second = first;
                first = num;
            } else if (num > second && num < first) {
                // Update second if num is less than first but greater than current second
                second = num;
            }
        }

        // Check if second largest exists; if not, return -1
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Create an array of size n
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read each element of the array
        }

        int result =SecondLargest(arr);
        System.out.println("Second largest element: " + result);

    }
}
