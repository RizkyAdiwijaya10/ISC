package informatic_study_club;
import java.util.Scanner;
public class day10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nilai n : ");
        double n = ayamBawang(sc.nextDouble());
        System.out.println(n);
        System.out.print("Nilai m : ");
        int m = baksoMercon(sc.nextInt());
        System.out.println(m);
        
    }

    public static double ayamBawang(double n) {
        System.out.println(2 * n);
        return n;

    }

    public static int baksoMercon (int m) {
        System.out.println(5 + m);
        return m;
    }
    
}
