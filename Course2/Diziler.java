package Course2;

public class Diziler {

    public static void main(String[] args) {

        Integer[] sayiDizisi = new Integer[3];
        sayiDizisi[0] = 2;
        sayiDizisi[1] = 5;
        sayiDizisi[2] = 25;

        //sayiDizisi[3] = 4; // runtime hata

        Integer[] dizi = {1, 5, 8, 6, 7};

        int[] array = new int[3];

        char c = 'c';

        array[0] = c; // hata vermez asci idegeri alır.

        String name = "Emre";
        //array[0]= name;

        long x = 10L;

        //array[1]=x;

        Integer[] integers = new Integer[5];
        integers[0] = 5;
        integers[1] = 23;
        integers[2] = 12;
        integers[3] = 213;
        integers[4] = 2156;

        for (int i = 0; i < integers.length; i++) {
            int eleman = integers[i];
            System.out.println(eleman);
        }

        String[] isimler = {"Mustafa", "Muhammed", "Emre"};
        for(String isim : isimler){
            System.out.println(isim);
        }

    }

}
