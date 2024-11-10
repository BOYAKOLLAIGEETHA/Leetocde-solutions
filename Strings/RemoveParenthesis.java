// Remove Outermost Parentheses
import java.util.Scanner;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        
        StringBuilder result = new StringBuilder();
        int depth = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(' && depth++ > 0) result.append(c);
            if (c == ')' && --depth > 0) result.append(c);
        }
        
        System.out.println("String after removing outermost parentheses: " + result.toString());
    }
}
