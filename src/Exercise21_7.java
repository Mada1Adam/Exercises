//not done, compare was in previous

import java.util.*;

public class Exercise21_7 {
    public static void main(String[] args) {
        // Set text in a string
        String text = "Good morning. Have a good class. " +
                "Have a good visit. Have fun!";

        // Create a Map to hold words as keys and count as values
        Map<String, Integer> map = new HashMap<>();

        // Compute and store the occurrence of each word
        String[] words = text.split("[ \n\t\r.,;:!?()]");
        for (String word: words) {
            String key = word.toLowerCase();

            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                }
                else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

    }
}