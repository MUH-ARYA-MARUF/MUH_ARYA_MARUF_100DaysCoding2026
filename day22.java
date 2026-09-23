public class Main {
    public static void main(String[] args) {
        String nama1 = "Arya";
        String nama2 = "Budi";
        String temp;

          System.out.println("Sebelum ditukar:");
          System.out.println("Nama 1 = " + nama1);
          System.out.println("Nama 2 = " + nama2);

        temp = nama1;
        nama1 = nama2;
        nama2 = temp;

          System.out.println("\nSetelah ditukar:");
          System.out.println("Nama 1 = " + nama1);
          System.out.println("Nama 2 = " + nama2);
    }
}
