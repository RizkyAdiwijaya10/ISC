import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int nilaiA = scanner.nextInt();

        System.out.print("Masukkan nilai b: ");
        int nilaiB = scanner.nextInt();

        int nilai1 = kali(nilaiA, nilaiB);
        int nilai2 = jumlah(nilaiA, nilaiB);
        int total = total(nilai1, nilai2);

        System.out.println("Hasil perkalian: " + nilai1);
        System.out.println("Hasil penjumlahan: " + nilai2);
        System.out.println("Total: " + total);

        scanner.close();
    }

    static int kali(int a, int b) {
        return a * b;
    }

    static int jumlah(int a, int b) {
        return a + b;
    }

    static int total(int nilai1, int nilai2) {
        return nilai1 + nilai2;
    }
}
