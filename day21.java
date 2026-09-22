public class Main {
    public static void main(String[] args) {

        String umur = "19";
        String nilai = "85.5";
        String mahasiswa = "true";

         int umurSaya = Integer.parseInt(umur);
         double nilaiSaya = Double.parseDouble(nilai);
         boolean status = Boolean.parseBoolean(mahasiswa);

          System.out.println("Umur saya: " + umurSaya);
          System.out.println("Nilai saya: " + nilaiSaya);
          System.out.println("Status mahasiswa: " + status);
    }
}
