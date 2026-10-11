import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Bilangan positif");
        } else if (angka < 0) {
            System.out.println("Bilangan negatif");
        } else {
            System.out.println("Bilangan nol");
        }

        if (angka % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }

        if (angka >= 1 && angka <= 100) {
            System.out.println("Berada di antara 1 dan 100");
        } else {
            System.out.println("Tidak berada di antara 1 dan 100");
        }

        System.out.println("Ditambah satu: " + (angka + 1));
        System.out.println("Dikurangi satu: " + (angka - 1));

    }
}
