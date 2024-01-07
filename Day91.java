public class Day91{
    public static void main(String [] args){
        int a,b;
        
        a = 5;
        b = 5;
        
        for(int i = a; i < a;i++){
            for(int j = b; j < b;j++){
                if(i % 2 == 0){
                    System.out.println("x ");
                }else{
                    System.out.println("o ");
                }
            }
            System.out.println();
        }
    }
}