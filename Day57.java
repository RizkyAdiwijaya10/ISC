public class Day57{
    public static void main(String[] args){
        
        int i = 5;
        
        do{
            System.out.print(i*3);
            i++;
            if(i <= 10){
                System.out.print(",");
            }
        }while(i <= 10);
        
    }
}