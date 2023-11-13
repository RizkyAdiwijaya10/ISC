import java.util.Scanner;

public class Day36{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = scanner.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int jumlahKolom = scanner.nextInt();

        int nilai = 1;

        for (int i = 1; i <= jumlahBaris; i++) {
            for (int j = 1; j <= jumlahKolom; j++) {
                System.out.print(nilai + "\t");
                nilai++; 
            }
            System.out.println();
        }

        scanner.close();
    }
}