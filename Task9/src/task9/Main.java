package task9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.print("Enter the length of the sequence: ");
        try{
            n = in.nextInt();
            if(n < 0)
                throw new InputMismatchException();
        }catch (InputMismatchException e){
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        int sum = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.printf("\nThe sum of the even numbers from 0 to %d: " + sum, n);
    }
}
