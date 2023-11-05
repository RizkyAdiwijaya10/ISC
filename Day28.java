import java.util.Scanner;

public class Day28{
    public static void main(String[] args){
        int [][] dataArray = {
            {78, 24, 65, 43, 876, 3, 54},
            {99, 765, 453, 8, 11, 56, 22},
        };
        
        for(int i = 0; i < dataArray.length; i++){
            System.out.print("[");
            for(int j = 0; j < dataArray[i].length; j++){
                if(j > 0){
                    System.out.print(", ");
                    System.out.print("\t");
                }
                System.out.print(dataArray[i][j]);
            }
            System.out.print("]");
            System.out.println();	
        }
        
    }
}