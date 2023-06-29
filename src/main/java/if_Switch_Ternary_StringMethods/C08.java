package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class C08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String isim = scan.next();

        if(isim.length()>=2){
            char son = isim.charAt(isim.length()-1);
            char sondanBir = isim.charAt(isim.length()-2);

            System.out.println(""+sondanBir+son+sondanBir+son+sondanBir+son);
        }
    }
}
