import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Tang tabungan awal : ");
       double tabunganAwal = input.nextDouble();
         System.out.print("Uang dari ayah : ");
       double uangayah = input.nextDouble();
         System.out.print("Uang dari ibu : ");
       double uangibu = input.nextDouble();
    
       double sisaUang= tabunganAwal+uangayah+uangibu;
         System.out.println("Uang tabungan rian saat ini : " + sisaUang);
         System.out.print("Rian membeli buku : ");
       double bukurian = input.nextDouble();

       double sisauang = sisaUang - bukurian;
        System.out.print("Sisa uang rian saat ini : "+ sisauang);
        input.close();

    }
}
