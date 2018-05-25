package task10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Enter three digits:");
        try {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            if(a < 0 || a > 9 || b < 0 || b > 9 || c < 0 || c > 9)
                throw new InputMismatchException();
        }catch (InputMismatchException e){
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        StringBuilder result = new StringBuilder();

        if(a != 0) {
            result.append(a).append(b).append(c);
            if(!result.toString().contains("" + a + c + b))
                result.append(" ").append(a).append(c).append(b);
        }

        if(b != 0 && !result.toString().contains("" + b + a + c)) {
            result.append(" ").append(b).append(a).append(c);
            if (!result.toString().contains("" + b + c + a))
                result.append(" ").append(b).append(c).append(a);
        }

        if(c != 0 && !result.toString().contains("" + c + a + b)) {
            result.append(" ").append(c).append(a).append(b);
            if (!result.toString().contains("" + c + b + a))
                result.append(" ").append(c).append(b).append(a);
        }

        System.out.println(result);
    }
}
