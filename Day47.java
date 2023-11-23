package informatic_study_club;

import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tinggi badan anda : ");
        double tinggi = sc.nextDouble();
        System.out.print("Berat badan anda : ");
        double berat = sc.nextDouble();
        double BMI = berat / (tinggi * tinggi);
        System.out.println("BMI : "+BMI);
        System.out.println("===============================================");
        if (BMI < 18.5) {
            System.out.println(" anda kurus");       
        }else if (BMI < 25){
            System.out.println("anda normal");
        }else if (BMI < 30){
            System.out.println("anda Gemuk");
        }else{
            System.out.println("anda Obesitas");
        }

    }
}
