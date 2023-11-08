import java.util.Arrays;
import java.util.Scanner;

public class Day31{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        String dataA = sc.nextLine();
        String[] dataB = dataA.split("\\s");
        
        for(String s : dataB){
            System.out.println(s);
        }
    }
}