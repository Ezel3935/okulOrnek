public class Kisi  {

    private String isim;
    private String soyIsim;
    private String tcNo;
    private int dogumYili;

    private static int kisiSayisi=0;

    public Kisi(String isim, String soyIsim, String tcNo, int dogumYili) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.tcNo = tcNo;
        this.dogumYili = dogumYili;
        kisiSayisi++;
    }

}
