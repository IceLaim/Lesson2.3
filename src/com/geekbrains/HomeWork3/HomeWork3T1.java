package com.geekbrains.HomeWork3;

import java.util.HashMap;
import java.util.Map;

public class HomeWork3T1 {

    private static final String[] INPUT_WORD = {
            "apple",
            "bicycle",
            "calendar",
            "dog",
            "cat",
            "frog",
            "dog",
            "hedgehog",
            "dog",
            "apple",
            "cat",
            "bicycle",
            "dog",
            "hedgehog",
            "calendar",
            "apple",
            "dog",
            "frog",
            "cat",
            "hedgehog"
    };

    public static void main(String[] args) {
        Map<String, Integer> frequencyByWord = new HashMap<>();

        for (String word : INPUT_WORD) {

            Integer frequency = frequencyByWord.get(word);
            if (frequency == null) {
                frequency = 0;
            }
            frequencyByWord.put(word, frequency + 1);

        }

        for (Map.Entry<String, Integer> entry : frequencyByWord.entrySet()) {
            System.out.printf("Слово %s встречается %d раз %n", entry.getKey(), entry.getValue());
        }
    }
}
