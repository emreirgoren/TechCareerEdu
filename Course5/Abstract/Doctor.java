package Course5.Abstract;

public abstract class Doctor {

    private String name;

    public void muayene(){
        System.out.println("Doktor muayene eder.");
    }

    public abstract void uzmanlık();

    public void maasZammiHesapla(int mevcutMaas, int calistigiYil, int zamKatsayisi){
        mevcutMaas = mevcutMaas * calistigiYil * zamKatsayisi;
        System.out.println(mevcutMaas);
    }

}
