import java.util.Scanner;

public class Day60{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak dalam kilometer: ");
        double km = input.nextDouble();

        // 1 km = 100,000 cm
        double cm = km * 100000;
        System.out.println(km + " kilometer sama dengan " + cm + " cm");
    
    }
}
