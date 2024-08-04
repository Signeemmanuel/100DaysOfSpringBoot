package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n\tCHARACTER FREQUENCY ANALYSER");

        String filePath = "./text.txt";

        Map<Character, Integer> frequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int ch;

            while ((ch = reader.read()) != -1) {
                char character = Character.toLowerCase((char) ch);
                frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
            }

            printBarChart(frequencyMap);


        } catch(IOException e) {
            System.out.println("An Error occurred");
            e.printStackTrace();
        }

    }

    public static void printBarChart(Map<Character, Integer> frequencyMap) {

        for(char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print("\n" + ch + " | ");

            for (int i = 0; i < frequencyMap.getOrDefault(ch, 0); i++) {
                System.out.print('*');
            }

        }
        System.out.println("\n\nCharacter Frequency Bar chart");

    }
}