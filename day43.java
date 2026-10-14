public class Day43 {
    public static void main(String[] args) {
        int angka = 15;

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("kelipatan 3 dan 5");
        } else if (angka % 3 == 0) {
            System.out.println("kelipatan 3");
        } else if (angka % 5 == 0) {
            System.out.println("kelipatan 5");
        } else {
            System.out.println("bukan kelipatan 3 atau 5");
        }
    }
}
