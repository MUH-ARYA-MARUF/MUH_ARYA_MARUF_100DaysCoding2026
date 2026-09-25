import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        double luas;

        System.out.print("Masukkan jari-jari : ");
        r = input.nextDouble();

        luas = 3.14 * r * r;
        System.out.println("Jadi, luas lingkaran adalah : " + luas);
    }
}
