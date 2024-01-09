package Course3;

public class StringYapisi {

    public static void main(String[] args) {

        String string1 = new String("Emine"); // new ile oluşturulan hersey hafızada yer açar içerik aynı olsa bile yeni yer açılır
        String string4 = new String("Emine");

        String string2 = "Beliz";

        String string3;
        string3 = "Can";

        string2 = "Can";

        if(string1 == string4){             // == hafızadaki referansı kontrol eder.
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        if(string1.equals(string4)){        // .equals string içindekileri karsılastırır.
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        if(string2.equals(string3)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        System.out.println("////");

        if(string2 == string3){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(string2.equals(string1)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        System.out.println("/////");

        String variable1 = "Emine";
        String variable2 = new String("Emine");
        System.out.println(variable1 == variable2);
        System.out.println(variable1.equals(variable2));

        System.out.println("/////");

        String name = "Hüseyin";
        String nameLastName = name + " " + "Coskun";
        System.out.println(nameLastName);

        System.out.println("/////");

        String name2 = "Yagmur";
        name2 = "Muhammed";
        System.out.println(name2);

        System.out.println("/////");

        String name3 = new String("Emre");
        name3 = "Yunus";
        System.out.println(name3);

        String isim = new String("Nisa");    //r101
        isim = "Emine";                             //a101
        isim = new String("Nisa");           //b101
        isim = "Emine";                             //a101

        System.out.println("/////");

        //String immutable yapılardır. değiştirilemezdir. Hafızada yer oluşturur.

        StringBuilder stringBuilder = new StringBuilder("Sayac Degeri: "); // StringBuildir yeni alan olusturmaz
        for(int i=0; i<10; i++){
            stringBuilder = stringBuilder.append(i);
            System.out.println(stringBuilder);
        }

        System.out.println("/////");

        String cumle = "Merhaba Dunyalı!";
        cumle = cumle.substring(3,8);
        System.out.println(cumle);

        System.out.println("/////");







    }

}
