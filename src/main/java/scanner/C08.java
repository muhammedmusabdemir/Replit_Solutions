package scanner;

import java.util.Scanner;

public class C08 {

    /*
      Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

   Örnek Çıktı:

   Verilen tamsayının rakamları toplamı 10'dur.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int sum = 0;
        int basamak = 0;
        do{

            basamak=sayi%10;
            sayi=sayi/10;
            sum =sum + basamak;

        }while(sayi>=1);
        System.out.println("Verilen tamsayinin rakamlari toplami " + sum + "'dur.");



    }
}
