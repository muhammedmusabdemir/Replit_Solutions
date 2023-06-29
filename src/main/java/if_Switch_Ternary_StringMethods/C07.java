package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class C07 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String isim1 = scan.next();
        String isim2 = scan.next();

        if(isim1.length() %2 == 0){
            System.out.println((isim1.substring(0, isim1.length()/2)) + isim2 + isim1.substring(isim1.length()/2,isim1.length()));
        }

        if(isim1.length() %2 != 0){
            System.out.println("isim1, isim2 ye eklenemiyor.");
        }
    }
}
