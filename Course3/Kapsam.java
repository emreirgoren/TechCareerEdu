package Course3;

public class Kapsam {

    public static void toplama(int sayi1, int sayi2){
        int toplam = sayi1 + sayi1;
        System.out.println(toplam);

        for (int i = 0; i < 10; i++) {
             toplam+=i;
            System.out.println(i);
        }
        
    }

    public int variable1 = 5;                    //Nesne Değişkeni

    public static int variable2= 4;            //Class Değişkeni

    public static void main(String[] args) {
        
        toplama(3,5);


    }

}
