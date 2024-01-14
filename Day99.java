import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int N = sc.nextInt();

        for (int i = N; i > 0; i--) {
            for (int j = N; j > 0; j--) {
                System.out.printf("%02d ", (i-1) * 1 + (j));
            }
            System.out.println();
        }
    }
}