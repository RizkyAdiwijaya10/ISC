public class Day48{

    public static void main(String[] args) {
        int a = 7;
        int b = a+2;
        
        for(int i = 1; i < b; i++){
            System.out.println(a++);
        }
    }
}