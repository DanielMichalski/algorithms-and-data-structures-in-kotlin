package pl.dmichalski.algorithms._7_binary_search;

/**
 * Given a sorted array of integer, write a function
 * called search, that accepts a value and returns the
 * index where the value passed to the function is located.
 * If value is not found, return -1
 */
public class Runner {

    public static void main(String[] args) {
        int[] sortedValues = {1, 2, 3, 4, 5, 6};
        int numberToSearch = 4;

        SearchService searchService = new SearchService();
        BinarySearchService binarySearchService = new BinarySearchService();

        int result1 = searchService.search(sortedValues, numberToSearch);
        int result2 = binarySearchService.search(sortedValues, numberToSearch);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
