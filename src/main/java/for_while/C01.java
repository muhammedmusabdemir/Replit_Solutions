package for_while;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String isim = scan.nextLine();
        char karakter = scan.next().charAt(0);

        char[] harfler = new char[isim.length()];
        for (int i = 0; i < isim.length(); i++) {
            harfler[i] = isim.charAt(i);
        }

        int ortakKarakterSayisi = 0;

        for(char w : harfler){
            if(w == karakter ){
                ortakKarakterSayisi++;
            }
        }


        System.out.println("Number of " + karakter + " = " + ortakKarakterSayisi);

    }
}
