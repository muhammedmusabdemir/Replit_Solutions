package scanner;

import java.util.Scanner;

public class C10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil degerini gormek istediginiz dakikayi giriniz...");

        int girilenDakika = scan.nextInt();

        int yil = 0;
        int gun = 0;
        int yilinDakikaDegeri = 0;
        int gununDakikaDegeri = 0;


        yil = girilenDakika/525600;

        yilinDakikaDegeri = yil*365*24*60;

        gununDakikaDegeri = girilenDakika - yilinDakikaDegeri;

        gun = gununDakikaDegeri/1440;


        System.out.println(girilenDakika + " dakika yaklasik " + yil + " yil " + gun + " gundur");
    }
}
