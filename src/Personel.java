public class Personel extends Kisi{
    private String sgkNo;
    private double maas;
    private static int personelSayisi=0;

    public Personel(String isim, String soyIsim, String tcNo, int dogumYili) {
        super(isim, soyIsim, tcNo, dogumYili);
        personelSayisi++;
    }

    public Personel() {
        super();
    }
}
