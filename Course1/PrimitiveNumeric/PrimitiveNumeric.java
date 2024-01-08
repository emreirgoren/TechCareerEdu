package Course1.PrimitiveNumeric;

import java.math.BigDecimal;

public class PrimitiveNumeric {

    public static void main(String[] args) {

        //Tam Sayılar

        byte byteValue = 127;
        byte byteValue2 = -128;
        System.out.println("byte value: " + byteValue);
        System.out.println("byte value2: " + byteValue2);

        String text = "Emre";

        short shortValue = 10000;
        System.out.println("short value: " + shortValue);

        int sayi = 556464654;
        System.out.println("int value: " + sayi);

        int sayi2 = 10_000_000;
        System.out.println("sayi2: " + sayi2);

        long longValue = 12345678888L;
        System.out.println("long value: " + longValue);

        //Noktalı Sayılar

        float floatValue = 1.1f;

        double doubleValue = 1.1;

        double totalDouble = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("total double: " + totalDouble);

        float totalFloat = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        System.out.println("float value: " + totalFloat);

        BigDecimal bigDecimalValue = BigDecimal.valueOf(3);
        System.out.println(bigDecimalValue);


        System.out.println(bigDecimalValue.compareTo(BigDecimal.valueOf(1)));


    }

}
