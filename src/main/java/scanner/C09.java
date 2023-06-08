package scanner;

import java.util.Scanner;

public class C09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Lutfen saati giriniz...");
        int verilenSaat = scan.nextInt();

        System.out.println("Lutfen dakikayi giriniz...");
        int verilenDakika = scan.nextInt();

        System.out.println("Lutfen saniye giriniz...");
        int verilenSaniye = scan.nextInt();

        System.out.println("Verilen zaman: " +verilenSaat+" saat "+verilenDakika+" dakika " +verilenSaniye + " saniye ");

        int sonuc = (verilenSaat*60*60)+(verilenDakika*60)+(verilenSaniye);
        System.out.println("Sonuc: " + sonuc +  " saniye ");
    }
}
