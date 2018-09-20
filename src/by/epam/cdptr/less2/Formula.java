package by.epam.cdptr.less2;


public class Formula {
    public static void main(String[] args){

        double x, y;
        double c, temp;

        ReadInput read = new ReadInput();

        x = read.getDouble("x");
        y = read.getDouble("y");

        temp = Math.cos(x) - (x/3);

        if (temp != 0) {
            c = x * Math.log(x) + y / temp;
        } else {
            System.out.println("Знаменатель равен нулю");
            c = Double.NaN;
        }

        System.out.println("Result = " + c);


    }
}
