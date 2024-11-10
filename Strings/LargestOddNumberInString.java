// Largest Odd Number in a String
import java.util.Scanner;

public class LargestOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        
        String largestOdd = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                StringBuilder num = new StringBuilder();
                
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num.append(s.charAt(i++));
                }
                
                if (num.length() > 0 && Integer.parseInt(num.toString()) % 2 != 0) {
                    if (num.length() > largestOdd.length()) {
                        largestOdd = num.toString();
                    }
                }
            }
        }
        
        System.out.println("Largest odd number: " + largestOdd);
    }
}
