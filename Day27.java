import java.util.Scanner;

public class Day27{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input nilai : ");
        int data = sc.nextInt();
        
        int i = 1;
        int jumlah = 0;
        do{
            System.out.println(i);
            jumlah += i;
            i++;
        }while (i <= data);
        
    System.out.println(jumlah);
    }
}