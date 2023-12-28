import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String inputString = scanner.nextLine();

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int symbolCount = 0;

        for (char character : inputString.toCharArray()) {
            if (Character.isUpperCase(character)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(character)) {
                lowercaseCount++;
            } else if (Character.isDigit(character)) {
                digitCount++;
            } else {
                symbolCount++;
            }
        }

        System.out.println("Jumlah uppercase: " + uppercaseCount);
        System.out.println("Jumlah lowercase: " + lowercaseCount);
        System.out.println("Jumlah angka: " + digitCount);
        System.out.println("Jumlah simbol: " + symbolCount);

        
    }
}
