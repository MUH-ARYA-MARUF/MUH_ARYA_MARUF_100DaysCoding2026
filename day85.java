
public class Day84 {
    public static void main(String[] args) {
        int[] angka = {15, 8, 20, 5, 12};
        int minimal = angka[0];

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] < minimal) {
                minimal = angka[i];
            }
        }
        System.out.println("Angka minimal adalah: " + minimal);
    }
}
