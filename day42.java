import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok : ");
        double gaji = in.nextDouble();

        double potongan = 0;
        if (gaji >= 5000000){
            potongan = gaji * 0.10;
        } else {
            potongan = gaji * 0.05;
        }
        double bersih = gaji - potongan;

        System.out.println("Potongan gaji : "+ potongan);
        System.out.println("Gaji bersih : "+ bersih);
        in.close();
    }
    
}
