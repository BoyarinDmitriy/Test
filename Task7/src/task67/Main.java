package task67;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.print("Enter the length of array: ");
        try{
            n = in.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        int[] arr = new int[n];

        arr[0] = (int)((random() * 90) + 10);

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = (int)((random() * 90) + 10);
            if(arr[i] < min){
                min = arr[i];
            } else if(arr[i] > max){
                max = arr[i];
            }
            System.out.println(arr[i]);
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
