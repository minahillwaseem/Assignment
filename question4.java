import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        input.close();
    }
}