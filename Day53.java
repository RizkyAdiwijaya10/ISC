
import java.util.Scanner;
public class Day53 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukkan nilai a : ");
        int a = sc.nextInt();
        System.out.print("masukkan nilai b : ");
        int b = sc.nextInt();
        boolean hasil1 = (a == b);
        System.out.println("apakah a == b? " + hasil1);
        
        System.out.print("masukkan nilai a : ");
        int c = sc.nextInt();
        System.out.print("masukkan nilai b : ");
        int d = sc.nextInt();
        boolean hasil2 = (c != d);
        System.out.println("apakah a != b? " + hasil2);
        
        boolean total = a+b ==	c+d;
        System.out.println("apakah a+b == c+d? " + total);
    }
}
