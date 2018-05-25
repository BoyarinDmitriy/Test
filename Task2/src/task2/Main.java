package task2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int getItself(int itself, int dummy){
        return itself;
    }

    public static int sum(int firstNumb, int secondNumb){
        return firstNumb + secondNumb;
    }

    public static int subtraction(int firstNumb, int secondNumb){
        return firstNumb - secondNumb;
    }

    public  static  int greatestCommonDivisor(int firstNumb, int secondNumb){
        //Euclid's algorithm application
        while (firstNumb != secondNumb) {
            if (firstNumb > secondNumb) {
                //swap two elements: firstNumb and secondNumb
                firstNumb = getItself(secondNumb, secondNumb = firstNumb);
            }
            secondNumb -= firstNumb;
        }

        return firstNumb;
    }

    public  static  int leastCommonMultiple(int firstNumb, int secondNumb){
        return firstNumb * secondNumb / greatestCommonDivisor(firstNumb, secondNumb);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstNumb = 0;
        int secondNumb = 0;

        try {
            System.out.print("The first integer number: ");
            firstNumb = in.nextInt();
            System.out.print("The second integer number: ");
            secondNumb = in.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        int sum = sum(firstNumb, secondNumb);
        int subtraction = subtraction(firstNumb, secondNumb);
        int greatestCommonDivisor = greatestCommonDivisor(firstNumb, secondNumb);
        int leastCommonMultiple = leastCommonMultiple(firstNumb, secondNumb);

        System.out.println(sum + " " + subtraction + " " + greatestCommonDivisor + " " + leastCommonMultiple);
    }
}
