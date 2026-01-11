import java.util.Scanner;

public class questioss7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer =");
        int g = input.nextInt();
        int R;
        R = (g) % 2;
        if (R == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        input.close();
    }
}