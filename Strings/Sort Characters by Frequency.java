// Sort Characters by Frequency
import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        
        Map<Character, Integer> freqMap = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.append(entry.getKey());
            }
        }
        
        System.out.println("String sorted by frequency: " + result.toString());
    }
}
