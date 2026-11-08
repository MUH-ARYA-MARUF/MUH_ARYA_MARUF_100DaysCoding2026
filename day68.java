import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int n = ab.nextInt();
        int rusak = ab.nextInt();
        int batas = ab.nextInt();

        if (n < 1) {
            return;
        }
        System.out.print("Nomor yang diperiksa: ");

        for (int i = 1; i <= n; i++) {
            if (i == batas) {
                break;
            }

            if (i == rusak) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Pemeriksaan selesai");
    }
}
