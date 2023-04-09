public class Akademisyen extends Personel {
    private String bölümü;
    private static int akademisyenSayisi=0;

    public Akademisyen(String isim, String soyIsim, String tcNo, int dogumYili, String bölümü) {
        super(isim, soyIsim, tcNo, dogumYili);
        this.bölümü = bölümü;
        akademisyenSayisi++;
    }


}
