import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            angka[i] = ab.nextInt();
        }

        System.out.println("\nIsi Array:");

        for (int i = 0; i < 5; i++) {
            System.out.println(angka[i]);
        }
    }
}
