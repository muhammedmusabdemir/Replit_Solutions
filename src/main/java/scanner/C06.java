package scanner;

import java.util.Scanner;

public class C06 {

    /*
     Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir float deger giriniz");
        float sayi = scan.nextFloat();
        sayi = (int) sayi;
        System.out.println(sayi);


    }
}
