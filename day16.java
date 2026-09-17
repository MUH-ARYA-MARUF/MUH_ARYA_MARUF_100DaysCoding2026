public class Main {
    public static void main(String[] args) {

        int siswa = 47;
        int kapasitasBus = 10;

        int busPenuh = siswa / kapasitasBus;
        int siswaSisa = siswa % kapasitasBus;

        System.out.println("Jumlah siswa       : " + siswa);
        System.out.println("Kapasitas bus      : " + kapasitasBus);
        System.out.println("Bus penuh          : " + busPenuh);
        System.out.println("Siswa yang tersisa  : " + siswaSisa);
    }
}
