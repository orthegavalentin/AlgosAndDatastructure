package com.orthega;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println(checkPermutation("abcd", "cda"));
        System.out.println(getValueOfChar('z'));
        permutationOfPalindrome("merde");

    }

    /**
     * A method to check if A given string contains only unique characters
     * 
     * @param word
     * @return boolean
     */

    public static boolean isUnique(String word) {
        if (word.length() == 0 || word.length() == 1)
            return true;
        char copyOfWord[] = word.toCharArray();
        Arrays.sort(copyOfWord);
        boolean result = true;
        for (int i = 0; i < copyOfWord.length - 1; i++) {
            if (copyOfWord[i] == copyOfWord[i + 1]) {
                result = false;
                break;
            }
        }

        return result;

    }

    /**
     * A method to check if two string are permutation of each other
     * 
     * @param a
     * @param b
     * @return
     */

    public static boolean checkPermutation(String a, String b) {
        if (a.length() != b.length())
            return false;

        char word1[] = a.toCharArray();
        char word2[] = b.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        for (int i = 0; i < word1.length - 1; i++) {
            if (word1[i] != word2[i])
                return false;

        }

        return true;

    }

    // replace empty space with String

    public static String replaceSpaceWithString(String word, String replacement) {

        return word.replaceAll("\\s+", replacement);
    }

    /**
     * Given a word check if it is a permutation of a palindrome String
     * 
     * all occurences of charcters must be even except one that is odd
     * 
     */

    public static boolean permutationOfPalindrome(String word) {
        int oddCount = 0;

        int occurences[] = new int['z' + 1 - 'a'];
        char[] wordTemp = word.toCharArray();

        for (char c : wordTemp) {
            int index = getValueOfChar(c);
            occurences[index]++;
            if (occurences[index] % 2 == 0) {
                oddCount--;
            } else {
                oddCount++;

            }
        }

        return oddCount <= 1;

    }

    static int getValueOfChar(char c) {

        if ('a' <= c && c <= 'z')
            return c - 'a';

        return -1;

    }

}
