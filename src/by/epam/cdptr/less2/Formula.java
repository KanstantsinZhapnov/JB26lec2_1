package by.epam.cdptr.less2;


public class Formula {
    public static void main(String[] args){

        double x = 180, y = 2;
        double c, temp;

        ScanDouble sc = new ScanDouble();

        x = sc.getInput("x");
        y = sc.getInput("y");

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
