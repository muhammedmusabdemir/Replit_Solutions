package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Kilonuzu kg cinsinden giriniz...");
        double kilo = scan.nextDouble();

        System.out.println("Boyunuzu metre cinsinden giriniz...");
        double boy = scan.nextDouble();

        double BMI = kilo/(boy*boy);

        System.out.println("Agirlik : " + kilo);

        System.out.println("Boy : " + boy);

        System.out.println("BMI : " + BMI);

        if(BMI<18.5){
            System.out.println("Zayifsiniz.");
        }else if(BMI>=18.5 & BMI<25){
            System.out.println("Kilonuz idealdir.");
        }else if(BMI>=25 & BMI<30){
            System.out.println("Sismansiniz.");
        }else{
            System.out.println("Obezsiniz");
        }
    }
}
