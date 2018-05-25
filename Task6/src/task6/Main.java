package task6;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static boolean isRightTriangle(double a, double b, double c){
        return a == sqrt(b*b + c*c) || b == sqrt(a*a + c*c) || c == sqrt(a*a + b*b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println("Enter the length of three segments: ");
        try {
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();

            if(a <= 0 || b <= 0 || c <= 0)
                throw new InputMismatchException();
        } catch (InputMismatchException e){
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        System.out.println(isRightTriangle(a, b, c));
    }
}
