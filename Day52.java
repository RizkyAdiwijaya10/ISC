
import java.util.Scanner;
public class Day52 {
    public static void main(String[] args) {
        int a,b;
        boolean hasil;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai a : ");
        a = sc.nextInt();
        System.out.print("masukkan nilai b : ");
        b = sc.nextInt();
        hasil = (a == b);
        System.out.println("apakah a == b? " + hasil);
        System.out.print("masukkan nilai a : ");
        a = sc.nextInt();
        System.out.print("masukkan nilai b : ");
        b = sc.nextInt();
        hasil = (a != b);
        System.out.println("apakah a != b? " + hasil);
    }
}
