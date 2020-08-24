package pl.dmichalski.algorithms._2_count_chars_in_text;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

class CharCounterService1 {

    /**
     * O(n) complexity
     */
    public Map<Character, Integer> charCount(String text) {
        Map<Character, Integer> charactersCounter = new HashMap<>();

        String lowerCaseText = text.toLowerCase();

        for (int i = 0; i < lowerCaseText.length(); i++) {
            Character character = lowerCaseText.charAt(i);

            Pattern pattern = Pattern.compile("[a-z0-9]");
            if (pattern.matcher(character.toString()).matches()) {
                charactersCounter.putIfAbsent(character, 0);
                int increasedValue = charactersCounter.get(character) + 1;
                charactersCounter.put(character, increasedValue);
            }
        }

        return charactersCounter;
    }

}
