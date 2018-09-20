package by.epam.cdptr.less2;

import java.util.*;

public class ReadInput {


    Double getDouble(String argument) {
        Scanner sc = new Scanner(System.in);
        double value = Double.MAX_VALUE;

        System.out.print("Введите " + argument + ": ");

        while (value == Double.MAX_VALUE) {

            try {
                value = sc.nextDouble();

            } catch (InputMismatchException e) {
                System.out.println("Incorrect input. Try again.");
                sc.next();
            }
        }

        return value;
    }
}
