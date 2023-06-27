package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        String buyukName = name.toUpperCase();
        char buyukNameIlkHarf = buyukName.charAt(0);
        String yildiz = "*".repeat(name.length() -1);
        String yildizliName = buyukNameIlkHarf + yildiz;



        String lastName = scan.next();
        String buyukLastName = lastName.toUpperCase();
        char buyukLastNameIlkHarf = buyukLastName.charAt(0);
        String yildizlastName = "*".repeat(lastName.length() -1);
        String yildizliLastName = buyukLastNameIlkHarf + yildizlastName;



        String rakamlar = scan.next();
        int uzunluk = rakamlar.length();
        String rakamlarIlkDort = rakamlar.substring(0,4).replaceAll(".","*");
        String rakamlarIkinciDort = rakamlar.substring(4,8).replaceAll(".","*");
        String rakamlarUcuncuDort = rakamlar.substring(8,12).replaceAll(".","*");

        String sonDort = rakamlar.substring(uzunluk-4);

        System.out.println(yildizliName + " " + yildizliLastName);

        System.out.println("CCN  : " + rakamlarIlkDort + " " + rakamlarIkinciDort + " " + rakamlarUcuncuDort + " " + sonDort);





    }
}
