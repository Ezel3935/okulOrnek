public class Ogrenci extends Kisi{
    private double notOrtalamasi;
    private String sinif;
    private static int ogrenciSayisi=0;

    public Ogrenci(String isim, String soyIsim, String tcNo, int dogumYili, double notOrtalamasi, String sinif) {
        super(isim, soyIsim, tcNo, dogumYili);
        this.notOrtalamasi = notOrtalamasi;
        this.sinif = sinif;
        ogrenciSayisi++;
    }
}
