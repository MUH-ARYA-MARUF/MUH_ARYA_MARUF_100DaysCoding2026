import java.util.Scanner;
public class BackToTheBeginning {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        String nama = ab.nextLine();
        String prodi = ab.nextLine();

        System.out.println("Perkenalkan saya " + nama + ", dari prodi " + prodi + ".");

        ab.close();
    }
}
