public class Main {
    public static void main(String[] args) {

        int umur = 20;
        double tinggi = 170.5;
        boolean mahasiswa = true;
        char nilai = 'A';

           String umurString = String.valueOf(umur);
           String tinggiString = String.valueOf(tinggi);
           String mahasiswaString = String.valueOf(mahasiswa);
           String nilaiString = String.valueOf(nilai);

        System.out.println("Umur: " + umurString);
        System.out.println("Tinggi: " + tinggiString);
        System.out.println("Mahasiswa: " + mahasiswaString);
        System.out.println("Nilai: " + nilaiString);
    }
}
