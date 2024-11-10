// Isomorphic String
import java.util.Scanner;
import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();
        
        if (s1.length() != s2.length()) {
            System.out.println("The strings are not isomorphic.");
            return;
        }
        
        HashMap<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                if (map.get(s1.charAt(i)) != s2.charAt(i)) {
                    System.out.println("The strings are not isomorphic.");
                    return;
                }
            } else {
                if (map.containsValue(s2.charAt(i))) {
                    System.out.println("The strings are not isomorphic.");
                    return;
                }
                map.put(s1.charAt(i), s2.charAt(i));
            }
        }
        
        System.out.println("The strings are isomorphic.");
    }
}
