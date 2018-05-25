package task8;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.print("Enter the length of sequence n (0 <= n <= 100): ");
        try {
            n = in.nextInt();
            if(n < 0 || n > 100)
                throw new InputMismatchException();
        }catch (InputMismatchException e){
            System.out.print("Incorrect input!");
            System.exit(0);
        }

        for(int i = 0; i <= n; i++){
            if(i < 10 || i % 10 == i / 10){
                System.out.println(i);
            }
        }

    }
}
