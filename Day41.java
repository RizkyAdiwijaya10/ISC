import java.util.Scanner;

public class Day41{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nilai : ");
        int n = scanner.nextInt();
        
        if(n % 2 == 0){
            for(int i = 2; i <= n;i+=2){
                System.out.println(i);
            }
        }else{
            for(int i = 1;i <= n; i+=2){
                System.out.println(i);
            }
        }
        

    }
}