package by.epam.cdptr.less2;

public class CircleCount {
    public static void main(String[] args) {
        Double r = -1.0, S, P;

        ReadInput read = new ReadInput();

        while (r < 0) {
            r = read.getDouble("Radius");
        }

        S = Math.PI * Math.pow(r, 2);
        P = 2 * Math.PI * r;

        System.out.println("Площадь круга: " + S);
        System.out.println("Периметр окружности: " + P);


    }
}
