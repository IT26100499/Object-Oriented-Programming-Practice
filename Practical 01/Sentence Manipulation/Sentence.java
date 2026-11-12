import java.util.Scanner;

public class SentenceProgram {
    public static void main(String[] args) {

        //Creating Scanner Object
        Scanner input = new Scanner(System.in);

        // Get the sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Count the number of words
        int wordCount = words.length;

        //Find the longest word(s)
        String longestWord = words[0];

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        //Reverse the sentence
        String reversedSentence = new StringBuilder(sentence).reverse().toString();

        //Print
        System.out.println("Number of words: " + wordCount);
        System.out.println("Longest word(s): " + longestWord);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
