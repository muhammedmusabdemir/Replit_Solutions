package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double toplam = a+b;


        if ((a>=0 && b>=0 && toplam <= 1000000000)){

            System.out.println("Numaralarin Toplami: " + toplam);

        } else if(a>=0 && b>=0 && toplam>=1000000000){
            System.out.println("OverFlow");
        }
    }
}
