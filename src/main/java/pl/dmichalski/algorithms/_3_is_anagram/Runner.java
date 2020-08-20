package pl.dmichalski.algorithms._3_is_anagram;

public class Runner {

    public static void main(String[] args) {
        String text1 = "kajak";
        String text2 = "ajakk";

        AnagramService1 anagramService1 = new AnagramService1();
        AnagramService2 anagramService2 = new AnagramService2();

        boolean result1 = anagramService1.areAnagrams(text1, text2);
        boolean result2 = anagramService2.areAnagrams(text1, text2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

}
