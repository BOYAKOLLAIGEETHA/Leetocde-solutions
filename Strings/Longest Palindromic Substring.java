// Longest Palindromic Substring (without DP)
import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        
        int start = 0, maxLength = 1;
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (isPalindrome(substring) && substring.length() > maxLength) {
                    start = i;
                    maxLength = substring.length();
                }
            }
        }
        
        System.out.println("Longest palindromic substring: " + s.substring(start, start + maxLength));
    }
    
    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
