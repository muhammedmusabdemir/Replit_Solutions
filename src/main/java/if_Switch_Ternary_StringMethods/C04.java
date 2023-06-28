package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class C04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char secenek = scan.next().charAt(0);

        switch(secenek){
            case 'a' :
                System.out.println("Talebiniz isleniyor");
                break;
            case 'b' :
                System.out.println("yine de ilgilendiginiz için tesekkur ederiz");
                break;
            case 'c' :
                System.out.println("Uzgunuz, su anda herhangi bir yardim yok");
                break;
            default :
                System.out.println("Gecersiz giris, lutfen tekrar deneyin!");
                break;
        }
    }
}
