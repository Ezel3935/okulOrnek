public class Akademisyen extends Personel {
    private String bölümü;
    private static int akademisyenSayisi=0;

    public Akademisyen(String isim, String soyIsim, String tcNo, int dogumYili, String bölümü,int maas,String sgkNo) {
        super(isim, soyIsim, tcNo, dogumYili,maas,sgkNo);
        this.bölümü = bölümü;
        akademisyenSayisi++;
    }


}
