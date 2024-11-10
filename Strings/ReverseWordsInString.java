// Reverse Words in a Given String
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        
        System.out.println("Reversed words: " + result.toString().trim());
    }
}
