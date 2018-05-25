package task3;
import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String str){
        boolean isPalindrome = true;

        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        return  isPalindrome;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = in.nextLine();
        System.out.println(isPalindrome(str));
    }
}
