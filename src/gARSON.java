import java.util.LinkedList;

public class gARSON extends menu {
private String isim;
    public String getGarsonName (gARSON garsonAdi){
        return this.isim;
    }

    // siparis gecme
    //siparis gorme
public gARSON(String garsonun_ismi){

    this.isim=isim;
}

    public void siparisGec(mASALAR masa, menu urun){
    masa.hesap+=urun.getFiyat();
    masa.yedikleri += urun.getIsim() + "\n";
        System.out.println(masa.isim + " masasina 1 adet " + urun.getIsim() + " eklendi.");
    }


}
