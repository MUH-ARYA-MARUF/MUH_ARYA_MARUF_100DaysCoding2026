
import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.print("angka pertama: ");
        int a = z.nextInt();

        System.out.print("angka kedua: ");
        int b = z.nextInt();

        System.out.print("pilih operasi (+, -, *, /): ");
        char op = z.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("hasil: " + (a + b));
                break;
            case '-':
                System.out.println("hasil: " + (a - b));
                break;
            case '*':
                System.out.println("hasil: " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("hasil: " + (a / b));
                else
                    System.out.println("tidak bisa dibagi nol");
                break;
            default:
                System.out.println("operator salah");
        }
    }
}
