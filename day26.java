import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14;

        double jari = sc.nextDouble();
        double luas = PI * jari * jari;

        System.out.println(luas);
    }
}
