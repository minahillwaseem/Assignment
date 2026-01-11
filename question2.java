import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        input.close();
    }
}
