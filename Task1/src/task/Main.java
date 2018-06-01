package task;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static boolean isPrime(int number){
        boolean isPrime = true;

        for(int i = 2; i <= sqrt(number); i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        System.out.print("Enter the integer number: ");

        Scanner in = new Scanner(System.in);
        int number = 0;

        try {
            number = in.nextInt();
        } catch (InputMismatchException e){
            System.out.println("It isn't the integer number!");
            System.exit(0);
        }

        System.out.print("The number is ");
        if(isEven(number))
            System.out.print("even and ");
        else
            System.out.print("odd and ");

        if(isPrime(number))
            System.out.println("prime.");
        else
            System.out.println("composite.");

    }
}
