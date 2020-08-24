package pl.dmichalski.algorithms._3_is_anagram;

import java.util.Arrays;

class AnagramService1 {

    /**
     * O(n log n) complexity
     */
    public boolean areAnagrams(String text1, String text2) {
        if (text1 == null || text2 == null) {
            return false;
        }
        if (text1.length() == 0 || text2.length() == 0 || text1.length() != text2.length()) {
            return false;
        }

        String text1LowerCase = text1.toLowerCase();
        String text2LowerCase = text2.toLowerCase();

        String text1Sorted = sortString(text1LowerCase);
        String text2Sorted = sortString(text2LowerCase);

        return text1Sorted.equals(text2Sorted);
    }

    private String sortString(String text) {
        char[] characters = text.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }

}
