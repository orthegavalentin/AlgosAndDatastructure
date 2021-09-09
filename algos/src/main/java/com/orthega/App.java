package com.orthega;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static boolean isUnique(String word) {
        if (word.length() == 0 || word.length() == 1)
            return true;
        char copyOfWord[] = (word.toCharArray());
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

}
