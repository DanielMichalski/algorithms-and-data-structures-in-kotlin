package pl.dmichalski.algorithms._8_naive_string_search;

/**
 * Write a function called countNumberOfAppearances, that accepts
 * two strings: text and searchingText and returns number of appearances
 * searchingText in the text.
 */
public class Runner {

    public static void main(String[] args) {
        String text = "Ala ma kota a nawet kota kota";
        String searchingText = "kota";

        StringSearchService searchService = new StringSearchService();
        int result = searchService.countNumberOfAppearances(text, searchingText);
        System.out.println("result = " + result);
    }

}
