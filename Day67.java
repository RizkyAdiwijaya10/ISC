import java.util.Scanner;

public class Day67{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("input first string : ");
        String str1 = sc.nextLine();
        
        System.out.print("input next string : ");
        String str2 = sc.nextLine();
        
        String str3 = str1.concat(str2);
        System.out.print(""+str3);
    }
}