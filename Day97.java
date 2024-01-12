import java.util.Scanner;

public class Day97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%02d ", (i) * 1 + (j + 1));
            }
            System.out.println();
        }
    }
}