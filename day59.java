public class day59 {
      public static void main(String[] args) {
        int M = 3;
        int N = 30;

        for (int i = 1; i <= N; i++){
            if (i % M == 0){
                System.out.print(i + " ");
            }
        }
    }
}
