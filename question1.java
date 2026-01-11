import java.util.Scanner;

public class question1 {
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
        input.close();
    }
}
