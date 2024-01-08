package Course1.WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

    public static void main(String[] args) {

        int sayi1 = 100;
        Integer sayi2 = 100;
        System.out.println("sayi1: " + sayi1);
        System.out.println("sayi2: " + sayi2);

        sayi2.toString();
        System.out.println(sayi2.toString().getClass());

        System.out.println();

        String stringValue1 = "100";
        String stringValue2 = "200";
        Integer integerValue = Integer.valueOf(stringValue1); // Integer Donderir
        int parseInt = Integer.parseInt(stringValue2); //int primitive dondurur

        System.out.println(Integer.valueOf(stringValue1).getClass());
        System.out.println(Integer.parseInt(stringValue2));

        System.out.println();

        System.out.println("Toplam: " + (integerValue + parseInt));

        System.out.println();

        int min = Integer.min(245, 645);
        System.out.println(min);

        System.out.println();

        double doubleValue1 = 0.3;
        Double doubleValue2 = 0.5;

        boolean boll1 = true;
        Boolean bool2 = false;

        System.out.println();

        int a = 5;
        Integer b = (int) a;
        System.out.println(b.getClass());

        System.out.println();

        //AutoBoxing
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }
        System.out.println(integerList);
        System.out.println(integerList.getClass());

        List<Integer> listInteger = new ArrayList<>();
        int total = 0;
        for (Integer i : listInteger) {
            total += i;
        }





    }

}
