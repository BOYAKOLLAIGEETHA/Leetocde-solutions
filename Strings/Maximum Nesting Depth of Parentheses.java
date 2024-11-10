// Maximum Nesting Depth of Parentheses
import java.util.Scanner;

public class MaxNestingDepth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        
        int maxDepth = 0, currentDepth = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }
        
        System.out.println("Maximum nesting depth: " + maxDepth);
    }
}
