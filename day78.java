import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        String user = "arya";
        String pass = "123";

        while (true) {
            System.out.print("Username: ");
            String u = ab.nextLine();

            System.out.print("Password: ");
            String p = ab.nextLine();

            if (u.equals(user) && p.equals(pass)) {
                System.out.println("Login Berhasil!");
                break;
            }
            System.out.println("Login Salah!");
        }
    }
}
