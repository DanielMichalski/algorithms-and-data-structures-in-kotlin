package pl.dmichalski.algorithms._2_count_chars_in_text;

import java.util.HashMap;
import java.util.Map;

public class CharCounterService2 {

    /**
     * O(n) complexity
     */
    public Map<Character, Integer> charCount(String text) {
        Map<Character, Integer> charactersCounter = new HashMap<>();

        String lowerCaseText = text.toLowerCase();

        for (int i = 0; i < lowerCaseText.length(); i++) {
            if (isAlphanumeric(lowerCaseText.charAt(i))) {
                Character character = lowerCaseText.charAt(i);
                charactersCounter.putIfAbsent(character, 0);
                int increasedValue = charactersCounter.get(character) + 1;
                charactersCounter.put(character, increasedValue);
            }
        }

        return charactersCounter;
    }

    private boolean isAlphanumeric(char character) {
        return ((int) character > 47 && (int) character < 58)
                || ((int) character > 64 && (int) character < 91)
                || ((int) character > 96 && (int) character < 123);
    }

}
