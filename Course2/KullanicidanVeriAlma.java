package Course2;

import java.util.Scanner;

public class KullanicidanVeriAlma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adınızı Giriniz: ");
        String name = sc.next();
        System.out.println("Merhaba " + name);

        while (true){
            System.out.println("Almak ıstedıgınız ürünü girin");
            String product = sc.next();
            System.out.println("Almak istediğiniz ürünün kg giriniz");
            int kilo = sc.nextInt();
            System.out.println("Ürün: " + product + " KG " + kilo);

            int total = kilo *5;
            System.out.println("Toplam Fiyat: " + total + " TL");

            System.out.println("Çıkmak için e tusuna basın. Devam etmek için herhangi bir tuşa basına");
            String exit = sc.next();
            if(exit.equals("e")){
                break;
            }
        }

    }

}
