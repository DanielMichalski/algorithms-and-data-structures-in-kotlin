package pl.dmichalski.algorithms._3_is_anagram;

import java.util.HashMap;
import java.util.Map;

class AnagramService2 {

    /**
     * O(n) time complexity
     */
    boolean areAnagrams(String text1, String text2) {
        if (text1 == null || text2 == null) {
            return false;
        }
        if (text1.length() == 0 || text2.length() == 0 || text1.length() != text2.length()) {
            return false;
        }

        String text1LowerCase = text1.toLowerCase();
        String text2LowerCase = text2.toLowerCase();

        Map<Character, Integer> characterCountWord1 = countCharacters(text1LowerCase);
        Map<Character, Integer> characterCountWord2 = countCharacters(text2LowerCase);

        return characterCountWord1.equals(characterCountWord2);
    }

    private Map<Character, Integer> countCharacters(String text) {
        Map<Character, Integer> charactersCounter = new HashMap<>();

        for (char character : text.toCharArray()) {
            charactersCounter.putIfAbsent(character, 0);
            int count = charactersCounter.get(character);
            charactersCounter.put(character, ++count);
        }

        return charactersCounter;
    }

}
