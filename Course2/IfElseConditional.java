package Course2;

import java.util.Random;

public class IfElseConditional {

    public static void main(String[] args) {

        int a = 10;
        int b = 27;

        if (a == 10) {
            System.out.println("a 10'a eşittir");
        } else {
            System.out.println("elseye girdi");
        }
        System.out.println();
        System.out.println("//////");
        System.out.println();

        Random random = new Random();

        int sayi = random.nextInt(100);
        System.out.println(sayi);
        if (sayi < 40) {
            System.out.println("Sayi 40'tan küçüktür");
        } else if (sayi > 40 && sayi < 50) {
            System.out.println("Sayi 40 ile 50 arasındadır");
        } else {
            System.out.println("Sayi 50'den büyüktür");
        }

        System.out.println();
        System.out.println("/////");
        System.out.println();

        int number = 3;
        if(number > 10){
            System.out.println("number 10dan buyukturtur");
        }else{
            System.out.println("number 10dan kucuktur");
        }

        System.out.println("////");

        String result = number > 10 ? "number 10dan buyukturtur" : "number 10dan kucuktur";
        System.out.println(result);



    }

}
