import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, hasil;

        System.out.print("Masukkan jari-jari: ");
        r = input.nextDouble();

        hasil = 3.14 * r * r;

        System.out.println("Hasil luas lingkaran = " + hasil);
    }
}
