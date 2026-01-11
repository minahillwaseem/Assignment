import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        input.close();
    }
}