package Course5.Interface;

public class XCompany implements SendMessage,Test {

    @Override
    public void sendSms() {
        System.out.println("Bu sms x şirketi tarafından gönderilmiştir.");
    }

    @Override
    public void sendMail() {
        System.out.println("Bu mail x şirketi tarafından gönderilmiştir");
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
