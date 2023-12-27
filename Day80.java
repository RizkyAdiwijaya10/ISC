public class Day80 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Menggunakan continue untuk melewati iterasi jika i adalah bilangan genap
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Iterasi ke-" + i);
        }
    }
}
