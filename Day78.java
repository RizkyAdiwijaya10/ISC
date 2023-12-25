import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total belanja: ");
        double totalBelanja = scanner.nextDouble();
        
        if (totalBelanja > 300000) {
            double diskon = 0.2 * totalBelanja;
            double totalPembayaran = totalBelanja - diskon;

            System.out.println("Anda mendapatkan diskon 20%!");
            System.out.println("Total pembayaran setelah diskon: " + totalPembayaran);
        } else {
            System.out.println("Total pembayaran: " + totalBelanja);
        }
        
    }
}
