public class Day58{
    public static void main(String[] args){
        
        int i = 1;
        System.out.print("[");
        do{
            System.out.print(i*3);
            i++;
            if(i <= 15){
                System.out.print(",");
            }
        }while(i <= 15);
        System.out.print("]");
    }
}