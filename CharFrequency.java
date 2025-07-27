import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String input = "programming";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
        }

        for (char ch : freq.keySet()) {
            System.out.println(ch + " : " + freq.get(ch));
        }
    }
}
