import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();
        
        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
        
    }
}
