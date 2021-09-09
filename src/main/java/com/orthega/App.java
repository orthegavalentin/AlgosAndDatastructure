package com.orthega;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println(checkPermutation("abcd", "cda"));
    }

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

}
