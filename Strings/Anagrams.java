// Check if two strings are anagrams of each other
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        
        if (s1.length() != s2.length()) {
            System.out.println("Strings are not anagrams.");
            return;
        }
        
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        
        if (java.util.Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }
}
