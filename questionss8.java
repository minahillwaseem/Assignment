import java.util.Scanner;
import java.lang.Math;

public class questionss8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length of side a =");
        double lna = input.nextDouble();
        System.out.print("enter length of side b =");
        double lnb = input.nextDouble();
        System.out.print("enter length of side c =");
        double lnc = input.nextDouble();
        double S;
        S = (lna + lnb + lnc) / 2;
        double triarea;
        triarea = Math.sqrt(S * (S - lna) * (S - lnb) * (S - lnc));
        System.out.print("area of triangle is =");
        System.out.println(triarea);
        input.close();
    }
}