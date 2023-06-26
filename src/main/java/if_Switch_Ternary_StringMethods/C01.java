package if_Switch_Ternary_StringMethods;

import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double kilo = scan.nextDouble();

        double boy = scan.nextDouble();

        double BMI = kilo/(boy*boy);



        System.out.println("BMI : " + BMI);

        if(BMI<18.5){
            System.out.println("zayifsiniz");
        }else if(BMI>=18.5 & BMI<25){
            System.out.println("kilonuz idealdir");
        }else if(BMI>=25 & BMI<30){
            System.out.println("sismansiniz");
        }else{
            System.out.println("obezsiniz");
        }

    }
}