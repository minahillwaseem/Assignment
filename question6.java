import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length of parallel side a =");
        double la = input.nextDouble();
        System.out.print("enter length of parallel side b =");
        double lb = input.nextDouble();
        System.out.print("enter hight between two parallel sides =");
        double lh = input.nextDouble();
        double TA;
        TA = 1.0 * lh * (la * lb) / 2;
        System.out.print("area of trapezoid is=");
        System.out.println(TA);
        input.close();
    }
}