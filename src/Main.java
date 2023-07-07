import java.util.HashMap;
import java.util.LinkedList;
public class Main {
// then press Enter. You can now see whitespace characters in your code.
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

    public static void main(String[] args) {


        menu balik = new menu(1, " Balik ->100 TL", 100);
        menu kasarli_balik = new menu(2, " Kasarli Balik ->130 TL", 130);
        menu kahvalti = new menu(3, " Kahvalti Menusu ->60 TL", 60);
        menu salata = new menu(4, " Salata Tabagi ->30 TL", 30);
        menu karpuz = new menu(5," Karpuz -> 25 TL ",25);


        mASALAR selale1 = new mASALAR("Selale 1");
        mASALAR selale2 = new mASALAR("Selale 2");
        mASALAR selale3 = new mASALAR("Selale 3");

        mASALAR kamelya8 = new mASALAR("Kamelya 8");

        gARSON ahmet = new gARSON("Ahmet Bey");
        gARSON vedat = new gARSON("Vedat Bey");

        mUTFAK mutfak = new mUTFAK();

        kASA kasa = new kASA();

        vedat.siparisGec(kamelya8,karpuz);
        vedat.siparisGec(kamelya8,salata);
        ahmet.siparisGec(kamelya8,kasarli_balik);

        mutfak.siparisGoster(kamelya8);
        
        kasa.masaninYedikleriniGoster(kamelya8);
        kasa.masaninFiyatiniHesapla(kamelya8);



    }
}