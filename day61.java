public class day61 {
    public static void main(String[] args) {
        int n = 5;
        int hasill = 1;

        for (int i = 1; i <= n; i++){
            hasill = hasill * i;
        }
        System.out.println("Hasil perkalian 1 sampai " + n + " = " + hasill);
    }
    
}
