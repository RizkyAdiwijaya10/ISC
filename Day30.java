import java.util.Arrays;

public class Day30{
    public static void main (String[] args){
        String dataA = "Jika kamu tidak sanggup menahan lelahnya belajar maka kamu harus sanggup menahan perihnya kebodohan";
        
        String[] dataB = dataA.split("\\s");
        
        for(String s : dataB){
            System.out.println(s);
        }
    }
}