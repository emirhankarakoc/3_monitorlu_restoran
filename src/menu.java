public class menu {
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String isim;
    private int fiyat;
    private int id;

public menu(int id, String isim, int fiyat){
    this.isim = isim;
    this.id=id;
    this.fiyat=fiyat;
}


    public menu() {

    }
}
