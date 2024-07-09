package yte.intern.spring_web.dto;

public class Kisi {

    private String isim;
    private String soyisim;
    private Long yas;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public Long getYas() {
        return yas;
    }

    public void setYas(Long yas) {
        this.yas = yas;
    }

    public void yasArtir() {
        yas++;
    }
}
