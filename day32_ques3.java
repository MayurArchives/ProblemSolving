import java.util.*;

public class day32_ques3 {
    public static String frequencySort(String s) {
        // Step 1: Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Sort the characters based on frequency (descending), and
        // lexicographically (ascending) for same frequency
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        entryList.sort((a, b) -> {
            if (b.getValue() == a.getValue()) {
                return a.getKey() - b.getKey(); // Sort alphabetically if frequencies are the same
            }
            return b.getValue() - a.getValue(); // Sort by frequency in descending order
        });

        // Step 3: Build the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            for (int i = 0; i < entry.getValue(); i++) {
                result.append(entry.getKey());
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = frequencySort(s);
        System.out.println(result);
    }
}
