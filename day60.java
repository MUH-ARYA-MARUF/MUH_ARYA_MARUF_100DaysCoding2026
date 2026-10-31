import java.util.Scanner;

public class day60 {
      public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int n, jumlah = 0;
        System.out.print("Masukkan nilai N : ");
        n = ab.nextInt();

        for (int i = 1; i <= n; i++){
            jumlah += i;
        }
        System.out.println("Jumlah = "+ jumlah);
    }
}
