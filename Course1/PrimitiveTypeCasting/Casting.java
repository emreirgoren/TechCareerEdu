package Course1.PrimitiveTypeCasting;

public class Casting {

    public static void main(String[] args) {

        byte byteValue = 127;

        short shortValue = 129;

        shortValue = byteValue;

        System.out.println("shortValue: " + shortValue);

        int intValue = 1_000_000;
        long longValue = 10_000_000_000L;
        //longValue = intValue;
        System.out.println("longValue: " + longValue);

        System.out.println();

        int intA = (int) longValue;
        System.out.println(intA);

        int intB = 1410065408;
        int intC = 1410065409;
        System.out.println(intB);
        System.out.println(intC);

        Integer value1=10;
        Integer value2=10;
        Integer value3 = 20;
        Integer value4 = 20;

        // -127 127 arasında true daha buyugunde false

        System.out.println(value1 == value2);
        System.out.println(value3 == value4);

        

    }

}
