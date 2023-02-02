import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do " +
            "eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam," +
            " quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " +
            "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia " +
            "deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> letters = new HashMap<>();
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (!letters.containsKey(text.charAt(i))) {
                letters.put(text.charAt(i), 1);

            } else {
                letters.put(text.charAt(i), letters.get(text.charAt(i)) + 1);
            }
        }
        int max = -1;
        char kMax = 0;
        int min = Integer.MAX_VALUE;
        char kMin = 0;
        for (Map.Entry<Character, Integer> kv : letters.entrySet()) {
            System.out.println(kv.getKey() + " - " + kv.getValue());
            if (kv.getValue() > max) {
                max = kv.getValue();
                kMax = kv.getKey();
            }
            if (kv.getValue() < min) {
                min = kv.getValue();
                kMin = kv.getKey();
            }
        }
    }
}