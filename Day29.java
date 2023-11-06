public class Day29{
    
    private String nama;
    
    public Day29() {
        nama = "Rizky adiwijaya";
    }
    
    public Day29(String namaku) {
        nama = namaku;
    }

    public void namaku() {
        System.out.println(nama);
    }

    public static void main(String[] args){
        Day29 obj1 = new Day29();
        obj1.namaku();
    
        Day29 obj2 = new Day29("ikky");
        obj2.namaku();
    }
}
