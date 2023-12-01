package Informatic_study_club;
import java.util.Scanner;

public class Day55{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nilai : ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("bilangan genap " );
            }else{
                System.out.print("bilangan ganjil ");
            }
            System.out.println(i);
        }
        

    }
}