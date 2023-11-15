public class Day38 {
    int panjang = 10;
    int lebar = 15;
    int tinggi = 30;
    int volume;
    
    public Day38(int panjang,int lebar,int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public void volume(){
        volume = panjang * lebar * tinggi;
    }
    public int getVolume() {
        return volume;
    }
}
