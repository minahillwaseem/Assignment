import java.util.Scanner;
import java.lang.Math;

public class classassignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your obtain marks=");
        int x = input.nextInt();
        System.out.print("enter your maxi marks=");
        int y = input.nextInt();
        double per;
        per = 1.0 * x / y * 100;
        System.out.print("your percentage is=");
        System.out.println(per);

        double pi = 3.148;
        System.out.print("enter radius of circle =");
        double r = input.nextDouble();
        double C;
        C = 2 * pi * r;
        double a;
        a = pi * (r * r);
        System.out.print("circumstance of circle =");
        System.out.println(C);
        System.out.print(" radius of circle =");
        System.out.println(a);

        System.out.print("enter original price =");
        int op = input.nextInt();
        System.out.print("enter discounted percentage = %");
        int disp = input.nextInt();
        double z;
        z = 1.0 * (disp * 1) / 100;
        double currentp;
        currentp = op * z;
        System.out.print("discounted price will be =");
        System.out.println(currentp);

        System.out.print("enter discounted price=");
        int cp = input.nextInt();
        System.out.print("enter discounted percentage =%");
        int dp = input.nextInt();
        double k;
        k = 1.0 * (dp * 1) / 100;
        double orip;
        orip = 1.0 * cp / k;
        System.out.print("original price will be=");
        System.out.println(orip);

        System.out.print("enter voltage =");
        double V = input.nextDouble();
        System.out.print("enter current =");
        double A = input.nextDouble();
        double P;
        P = V * A;
        System.out.print("power will be =");
        System.out.print(P);
        System.out.println("watt");

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

        System.out.print("enter an integer =");
        int g = input.nextInt();
        int R;
        R = (g) % 2;
        if (R == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

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