package by.epam.cdptr.less2;

public class Task2 {
    public static void main(String[] args) {
        double a, b, c;
        double result, temp1, temp2;

        ReadInput read = new ReadInput();

        a = read.getDouble("a");
        b = read.getDouble("b");
        c = read.getDouble("c");

        temp1 = 2 * a;
        temp2 = Math.pow(b,2) + 4 * a * c;

        if (temp1 != 0) {

            if (temp2 >= 0) {

                result = (b + Math.sqrt(temp2))/temp1 - Math.pow(a, 3) * c + b;

            } else {
                System.out.println("Корень отрицательного числа : " + temp2);
                result = Double.NaN;
            }

        } else {
            System.out.println("Знаменатель равен нулю");
            result = Double.NaN;
        }

        System.out.println("Result = " + result);
    }
}
