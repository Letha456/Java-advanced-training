package Chapter8;

import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/13/2026
 **/

public class ExploreExceptions {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            String name;
            int numerator, denominator;
            double quotient;

            System.out.println("Enter your name: ");
            name = sc.next();
            System.out.println("Enter numerator: ");
            numerator = sc.nextInt();
            System.out.println("Enter denominator: ");
            denominator = sc.nextInt();

            InputStreamReader read = new InputStreamReader(null);


            quotient = numerator / denominator;

            System.out.println("Name: " + name);
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Quotient: " + quotient);
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input type: " + e.getCause());
        }

    }
}
