public class Day40 {
    public static void main(String[] args) {
        int nilai1 = kali(15, 10);
        int nilai2 = jumlah(15, 10);
        int total = nilai1 + nilai2;

        System.out.println("Hasil perkalian: " + nilai1);
        System.out.println("Hasil penjumlahan: " + nilai2);
        System.out.println("total : " + total);
    }

     
    static int kali(int a, int b) {
        return a + b; 
    }
    
    static int jumlah(int a, int b) {
        return a - b; 
    }
    static int total(int nilai1,int nilai2){
        return nilai1 + nilai2;
    }
}