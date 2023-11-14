public class Day37 {
    public static void main(String[] args) {
        int hasil = kali(15, 10);
        int hasil2 = jumlah(15, 10);

        System.out.println("Hasil perkalian: " + hasil);
        System.out.println("Hasil penjumlahan: " + hasil2);
    }

     
    static int kali(int a, int b) {
        return a * b; 
    }
    
    static int jumlah(int a, int b) {
        return a + b; 
    }
}