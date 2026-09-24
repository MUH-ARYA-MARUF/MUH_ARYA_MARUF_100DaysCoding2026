import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sisi, luas;

        System.out.print("Masukkan panjang sisi: ");
        sisi = sc.nextInt();

        luas = sisi * sisi;

        System.out.println("Hasil luas persegi: " + luas);
    }
}
