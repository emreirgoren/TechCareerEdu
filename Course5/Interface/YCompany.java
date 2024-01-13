package Course5.Interface;

public class YCompany implements SendMessage,Test{

    @Override
    public void sendSms() {
        System.out.println("Bu sms y şirketi tarafından gönderilmiştir.");
    }

    @Override
    public void sendMail() {
        System.out.println("Bu mail y şirketi tarafından gönderilmiştir.");
    }

    @Override
    public void test1() {
        SendMessage.super.test1();
    }

    @Override
    public void defaultMethod() {
        SendMessage.super.defaultMethod();
    }


}
