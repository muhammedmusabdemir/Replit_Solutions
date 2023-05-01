package scanner;

import java.util.Scanner;

public class C03 {

    /*
      Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

      Örnek Çıktı:

      Alan: 32

      Çevre: 24

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenarini giriniz");
        int kisakenar = scan.nextInt();
        System.out.println("Dikdortgenin uzun kenarini giriniz");
        int uzunkenar = scan.nextInt();
        int alan = kisakenar*uzunkenar;
        System.out.println("Alan: " + alan);
        int cevre = 2*(kisakenar+uzunkenar);
        System.out.println("Cevre: " + cevre);




    }

}
