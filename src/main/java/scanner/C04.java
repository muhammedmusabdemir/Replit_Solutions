package scanner;

import java.util.Scanner;

public class C04 {
    /*
      Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

      1 şeker = 1.7 gr

      Örnek Çıktı:
      çay=10
      şeker=2
      Yılda 12.41 kg şeker kullanıyor.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorusunuz?");
        int cay = scan.nextInt();
        System.out.println("Bir bardak caya kac adet seker atiyorusunuz?");
        int seker = scan.nextInt();
        double adetseker = 1.7;
        double yillikseker = cay*seker*adetseker*0.001*365;
        System.out.println("Yilda " + yillikseker + " kg seker kullaniyor.");



    }
}
