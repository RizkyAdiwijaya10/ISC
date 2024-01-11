import java.util.Date;
import java.text.SimpleDateFormat;

public class Day96 {

    public static void main(String[] args) {
        
        Date tanggalSaatIni = new Date();
        
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String formatDate = format.format(tanggalSaatIni);
            
        System.out.println("Tanggal saat ini: " + formatDate);
    }
}
