package by.epam.cdptr.less2;

import java.util.*;

class ReadInput {


    Double getDouble(String argument) {
        Scanner sc = new Scanner(System.in);
        double value;

        System.out.print("Введите " + argument + ": ");

        while (!sc.hasNextDouble()) {

            System.out.print("Incorrect input. Введите " + argument + ": ");
            sc.nextLine();
        }

        value = sc.nextDouble();
        return value;
    }


    Integer getInteger(String argument) {
        Scanner sc = new Scanner(System.in);
        Integer value;

        System.out.print("Введите " + argument + ": ");

        while (!sc.hasNextInt()) {
            System.out.print("Incorrect input. Введите " + argument + ": ");
            sc.nextLine();
        }

        value = sc.nextInt();

        return value;
    }
}
