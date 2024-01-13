package Course5.inheritance;

public class Bird extends Animal{

    @Override //Anotasyon kullanılmak zorunda degıl ama kullanılmalı.
    public void feed() {
        super.feed();
        System.out.println("Bird is feed");
    }

    public void fly(){
        System.out.println("Bird fly");
    }

}
