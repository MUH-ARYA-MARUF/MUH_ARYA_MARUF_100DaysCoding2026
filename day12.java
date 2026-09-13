import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            System.out.print("masukkan nama :");
                String nama = input.nextLine();
            System.out.print("masukkan umur : ");
                 int umur = input.nextInt();
             System.out.print("masukkan jenis kelamin :");
                 char jenis = input.next().charAt(0);
            System.out.print("masukkan TB :");
                double tinggi = input.nextDouble();
            System.out.print("masukkan BB :");
                 Float berat = input.nextFloat();

        System.out.println("=====Biodata diri======");
        System.out.println("Nama saya : " + nama);
        System.out.println("Umur saya : " + umur + " tahun");
        System.out.println("Jenis kelamin : " + jenis);
        System.out.println("Tinggi badan saya : " + tinggi);
        System.out.println("Berat badan saya : " + berat);

    }
}
