package Course5.Polimorfizm.Flowers;

public class Client {

    public static void main(String[] args) {

        Rose rose = new Rose();
        rose.color = "red";
        rose.dikenli = true;

        Flower daisy = new Daisy(); //Upcasting
        daisy.color = "white";
        daisy.smell();

        Flower flower = new Rose();
        Rose rose1 = (Rose) flower; // DownCasting

        rose1.smell();
        rose1.color = "white";
        rose1.test();


    }

}
