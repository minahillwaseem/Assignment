import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter voltage =");
        double V = input.nextDouble();
        System.out.print("enter current =");
        double A = input.nextDouble();
        double P;
        P = V * A;
        System.out.print("power will be =");
        System.out.print(P);
        System.out.println("watt");
        input.close();
    }
}