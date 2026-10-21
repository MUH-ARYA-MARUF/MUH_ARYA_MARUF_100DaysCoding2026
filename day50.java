
import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = z.nextInt();
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("angka " + angka + " adalah " + hasil);
    }
}
