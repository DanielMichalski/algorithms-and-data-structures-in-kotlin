package pl.dmichalski.algorithms._2_count_chars_in_text;

import java.util.Map;

/**
 * Write a function which takes in a  string and returns
 * counts of each character in the string.
 */
public class Runner {

    public static void main(String[] args) {
        String text = "Example! ";

        CharCounterService1 charCounterService1 = new CharCounterService1();
        CharCounterService2 charCounterService2 = new CharCounterService2();

        Map<Character, Integer> result1 = charCounterService1.charCount(text);
        Map<Character, Integer> result2 = charCounterService2.charCount(text);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

}
