package scanner;

import java.util.Scanner;

public class C07 {

    /*
     Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen DOUBLE data tipinde bir sayi giriniz");
        double sayi = scan.nextDouble();
        sayi = (int) sayi;
        System.out.println(sayi);


    }
}
