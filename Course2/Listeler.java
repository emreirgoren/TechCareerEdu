package Course2;

import java.util.ArrayList;
import java.util.List;

public class Listeler {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        // Arrays.asList();
        //List.of();

        isimler.add("Sinan");
        isimler.add("Yagmur");
        isimler.add("Hasan");
        isimler.add("Bekir");

        for(int i = 0; i<isimler.size();i++){
            if(i==2){
                isimler.remove((i));
                System.out.println("Silinen isim: " + isimler.get(i));
            }
            System.out.println(isimler.get(i));
        }

        System.out.println("////");

        System.out.println(isimler.get(1));
        System.out.println(isimler.size());

        for(String isim : isimler){

        }

    }

}
