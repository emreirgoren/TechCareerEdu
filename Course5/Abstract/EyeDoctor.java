package Course5.Abstract;

public class EyeDoctor extends Doctor {

    @Override
    public void uzmanlık() {
        System.out.println("Uzmalık alanı gözdür.");
    }

    @Override
    public void maasZammiHesapla(int mevcutMaas, int calistigiYil, int zamKatsayisi) {
        int oran = (mevcutMaas * calistigiYil) * 10 / 100;
        mevcutMaas = mevcutMaas * calistigiYil * zamKatsayisi + oran;
        System.out.println(mevcutMaas);
    }

}
