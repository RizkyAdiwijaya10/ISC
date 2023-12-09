import java.util.Scanner;

public class Day42{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nilai : ");
        int n = scanner.nextInt();
        
        if(n % 2 == 0){
                System.out.println(n + " adalah bilangan genap");
            
        }else{
                System.out.println(n + "adalah bilangan ganjil");
            
        }
        
    }
}