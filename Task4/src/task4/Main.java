package task4;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = in.nextLine();

        String[] sentenceSplit = sentence.split(" |,");
        Arrays.sort(sentenceSplit);

        System.out.print("Words: ");
        int wordsCount = 0;

        for(int i = 0; i < sentenceSplit.length; i++) {
            if(!sentenceSplit[i].isEmpty()) {
                System.out.print(sentenceSplit[i] + " ");
                wordsCount++;
            }
        }

        System.out.println("\nCount: " + wordsCount);
    }
}
