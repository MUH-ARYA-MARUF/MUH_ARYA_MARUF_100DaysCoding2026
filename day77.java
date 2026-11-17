public class Day74 {
    public static void main(String[] args) {

        String kata = "Belajar Java";

        System.out.println("Teks awal: " + kata);
        System.out.println("Panjang teks: " + kata.length());
        System.out.println("Huruf besar: " + kata.toUpperCase());
        System.out.println("Huruf kecil: " + kata.toLowerCase());
        System.out.println("Mengganti kata: " + kata.replace("Java", "Coding"));
        System.out.println("Mengambil kata: " + kata.substring(0, 7));
        System.out.println("Mengandung Java: " + kata.contains("Java"));
        System.out.println("Apakah kosong: " + kata.isEmpty());
        System.out.println("Membandingkan teks: " + kata.equals("Belajar Java"));
        System.out.println("Menghapus spasi: " + kata.trim());
    }
}
