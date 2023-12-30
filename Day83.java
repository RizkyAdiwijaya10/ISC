import java.util.Arrays;

public class Day83 {
    public static void main(String[] args) {
        int[] nilai = {10, 5, 2, 7, 3, 8, 1, 6, 4};

        // Urutkan array dalam urutan ascending
        Arrays.sort(nilai);

        
        System.out.println("Array yang telah diurutkan : ");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]+" ");
            
        }
    }
}
