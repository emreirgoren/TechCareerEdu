package Course5.Interface;

public interface SendMessage {

    //Gövdesiz metotlar
    public void sendSms();

    public void sendMail();

    public default void test1(){

    }

    public static void test2(){

    }

    public default void defaultMethod(){

    }

    public static void staticMethod(){

    }

}
