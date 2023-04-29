package scanner;

import java.util.Scanner;

public class C01 {
    /*
    Question:
    Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
    */
        public static void main(String[] args) {

            System.out.println("Bir sayi giriniz.");
            Scanner scan = new Scanner(System.in);
            int sayi1 = scan.nextInt();
            int result = (sayi1 * sayi1 * sayi1)/2;
            System.out.println(result);

        }
    }

