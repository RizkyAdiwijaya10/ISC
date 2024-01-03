public class Day87 {
    public static void main( String[] args){
        int a = 7;
        
        for (int i = a; i >= 1; i--){
            for (int j = i; j <= a; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        
    }
}