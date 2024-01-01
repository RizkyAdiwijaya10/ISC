public class Day84{
    public static void main(String[] args) {
        int[] bilangan = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] % 2 != 0) {
                System.out.println((int) bilangan[i]); 
            } else {
                System.out.println((double) bilangan[i]);
            }
        }
    }
}
