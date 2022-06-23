package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // create a string of all characters
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // specify length of random string
        int length = 70;

        String[] arrayStrings = new String[2];

        for (int i = 0; i < 2; i++) {

            // create random string builder
            StringBuilder sb = new StringBuilder();

            // create an object of Random class
            Random random = new Random();

            for (int j = 0; j < length; j++) {

                // generate random index number
                int index = random.nextInt(alphabet.length());

                // get character specified by index
                // from the string
                char randomChar = alphabet.charAt(index);

                // append the character to string builder
                sb.append(randomChar);
            }

            String randomString = sb.toString();
            System.out.println("Random String " + i + " is: " + randomString);

            arrayStrings[i] = randomString;

            length = 80;

        }

        char ch;
        char ch2;
        String sameChapters = new String();
        String wordsChangeNotRepeat = "";

        for (int i = 0; i < arrayStrings[0].length(); i++) {
            ch = arrayStrings[0].charAt(i);

            for (int j = 0; j < arrayStrings[1].length(); j++) {

                ch2 = arrayStrings[1].charAt(j);

                if (ch == ch2) {
                    if (wordsChangeNotRepeat.indexOf(ch) == -1) {
                        wordsChangeNotRepeat += ch;
                    }
                }

            }

        }

        System.out.println(wordsChangeNotRepeat);

    }
}

