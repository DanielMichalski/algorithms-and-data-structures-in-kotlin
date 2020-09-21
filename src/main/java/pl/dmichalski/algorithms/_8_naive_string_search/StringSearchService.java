package pl.dmichalski.algorithms._8_naive_string_search;

class StringSearchService {

    /**
     * O(n*k) time complexity
     */
    int countNumberOfAppearances(String text, String searchingText) {
        if (text == null || searchingText == null) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < text.length() - searchingText.length() + 1; i++) {
            for (int j = 0; j < searchingText.length(); j++) {
                if (text.charAt(i + j) != searchingText.charAt(j)) {
                    break;
                }
                if (j == searchingText.length() - 1) {
                    count++;
                }
            }
        }

        return count;
    }

}

