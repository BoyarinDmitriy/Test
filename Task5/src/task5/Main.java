package task5;
import java.util.Scanner;

public class Main {

    public static int wordsCount(String text, String word){
        int wordsCount = 0;

        text = text.replaceAll( "\\p{Punct}|^|$", " ").toLowerCase();

        String pattern = " " + word.toLowerCase() + " ";

        while (text.contains(pattern)){
            text = text.replaceFirst(pattern, " ");
            wordsCount ++;
        }

        return  wordsCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = in.nextLine();

        System.out.print("Enter the word: ");
        String word = in.nextLine();

        int wordsCount = wordsCount(text, word);

        System.out.println("Count: " + wordsCount);
    }
}
