import java.util.Scanner;

public class ArrayWordOperation {
    public static void main(String[] args) {

        //Create Scanner Object
        Scanner input = new Scanner(System.in);

        //Creating an array to store 5 words
        String[] words = new String[5];

        //Variables to store longest word and total number of characters
        String longestWord;
        int totalCharacters = 0;

        //Get 5 words from the user
        System.out.println("Enter 5 words :");

        for (int i = 0; i < words.length; i++) {
            words[i] = input.next();
        }
        //Assume the first word is the longest word
        longestWord = words[0];

        // Find the longest word and calculate total characters
        for (int i = 0; i < words.length; i++) {

            // Check whether the current word is longer
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }

            // Add the length of each word to the total
            totalCharacters = totalCharacters + words[i].length();
        }

        //Display the longest word
        System.out.println("Longes word : " + longestWord);

        //Display total number of characters
        System.out.println("Total Characters : " +totalCharacters);

        //Display words with even number of characters
        System.out.println("---Words with even number of characters---");

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
    }
}
