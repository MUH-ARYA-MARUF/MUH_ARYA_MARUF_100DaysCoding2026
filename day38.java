import java.util.Scanner;
public class day38 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.print("Masukkan angka menu : ");
        int pilihan = ab.nextInt();

        System.out.println("==== Menu Makanan ====");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");

        if (pilihan == 1 ){
            System.out.println("Anda memilih Nasi Goreng");
        }
        if (pilihan == 2){
            System.out.println("Anda memilih Mie Ayam");
        }
        if (pilihan == 3){
            System.out.println("Anda memilih Bakso");
        }
        ab.close();
    }
    
}
