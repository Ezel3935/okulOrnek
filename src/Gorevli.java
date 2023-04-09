public class Gorevli extends Personel {
    private String departman;
    private static int gorevliSayisi=0;

    public Gorevli(String isim, String soyIsim, String tcNo, int dogumYili, int maas, String sgkNo, String departman) {
        super(isim, soyIsim, tcNo, dogumYili, maas, sgkNo);
        this.departman = departman;
        gorevliSayisi++;
    }
}
