package scanner;

import java.util.Scanner;

public class C02 {
    /*
    Question:
    Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

    Ornek Cikti :

    Alan: 9

    Cevre: 12
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Karenin bir kenar uzunlugunu giriniz.");
        int kenar = scan.nextInt();
        int alan = kenar*kenar;
        int cevre = 4*kenar;
        System.out.println("Alan: " + alan + "\n" +"Cevre: " + cevre);

    }
}
