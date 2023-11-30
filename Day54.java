public class Day54{
    public static void main (String[] args){
        int a,b;
        
        a = 5;
        b = 8 * ++a;
        
        for(int i = 1; i <= b+2; i++){
            System.out.println(i + i);
        }
        
    }
}